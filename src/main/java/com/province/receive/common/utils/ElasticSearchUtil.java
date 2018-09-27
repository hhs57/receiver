package com.province.receive.common.utils;

import com.province.receive.config.EsConfig;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author hanhongshuang
 * @ClassName: ElasticSearchUtil
 * @Description:
 * @date 2018年8月9日
 */
@Component
public class ElasticSearchUtil {

    private static Logger logger = LoggerFactory.getLogger(ElasticSearchUtil.class);

    @Autowired
    EsConfig esconfig;

    public static ElasticSearchUtil elasticsearchutil;

    @PostConstruct
    public void init() {
        elasticsearchutil = this;
        elasticsearchutil.esconfig = this.esconfig;
    }

    private static TransportClient client;

    private static TransportClient getIstance() throws UnknownHostException {
        if (client == null) {
            //同步代码块（对象未初始化时，使用同步代码块，保证多线程访问时对象在第一次创建后，不再重复被创建）
            synchronized (TransportClient.class) {
                if (client == null) {
                    Settings settings = Settings.builder()
                            .put("cluster.name", elasticsearchutil.esconfig.getClustername())
                            .put("client.transport.sniff", true)
                            .build();
                    client = TransportClient.builder().settings(settings).build()
                            .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(elasticsearchutil.esconfig.getHost()), elasticsearchutil.esconfig.getPort()));
                }
            }
        }
        logger.info("连接信息:" + client.toString());
        return client;
    }


    /**
     * 关闭连接
     *
     * @return void
     * @Title: closeConnect
     * @author hanhongshuang
     * @date 2018年8月9日
     */
    public void closeConnect() {
        if (null != client) {
            logger.info("执行关闭连接操作...");
            client.close();
        }
    }


    /**
     * 详细描述方法的功能与意图
     *
     * @param jsonStr 字符串
     * @return 返回插入的文档id
     * @author hongshuh
     * @date 2018/9/11 18:17
     */
    public static String insertJsonFarmat(String jsonStr) throws UnknownHostException {
        /**
         * 此处暂时写成固定的index和type，以后会根据业务修改
         */
        IndexResponse response = getIstance().prepareIndex(elasticsearchutil.esconfig.getIndexname(), elasticsearchutil.esconfig.getTypename())
                .setSource(jsonStr).setContentType(XContentType.JSON).get();
        logger.info("json索引名称:" + response.getIndex() + "\njson类型:" + response.getType()
                + "\njson文档ID:" + response.getId() + "\n当前实例json状态:");
        return response.getId();
    }


    public static void main(String[] args) {
        try {
            ElasticSearchUtil.insertJsonFarmat("{\n" +
                    "  \"relateData\": {\n" +
                    "    \"path\": \"/0/output/2018081311/SB,00A502C0DBEA9C3B,841832,2018-08-13.pcm\",\n" +
                    "    \"startTime\": \"2018-08-13 10:08:54\",\n" +
                    "    \"timeSection\": \"10\",\n" +
                    "    \"endTime\": \"2018-08-13 10:09:42\",\n" +
                    "    \"ani\": \"18782089355\"\n" +
                    "  },\n" +
                    "  \"qualityData\": {\n" +
                    "    \"keyInfoWordList\": [],\n" +
                    "    \"voiceOverlapList\": [],\n" +
                    "    \"banWordList\": [],\n" +
                    "    \"senseWordList\": [],\n" +
                    "    \"silenceList\": [],\n" +
                    "    \"busiWordList\": [\n" +
                    "      {\n" +
                    "        \"beginDate\": 9290,\n" +
                    "        \"role\": \"AGENT\",\n" +
                    "        \"endDate\": 9480,\n" +
                    "        \"keyWord\": \"电表\"\n" +
                    "      }\n" +
                    "    ]\n" +
                    "  },\n" +
                    "  \"analysisData\": {\n" +
                    "    \"recommendId\": \"\",\n" +
                    "    \"isRepeatCall\": \"1\",\n" +
                    "    \"recommendRank\": \"0\",\n" +
                    "    \"standardSpeechName\": \"\",\n" +
                    "    \"innerComplaint\": \"2\",\n" +
                    "    \"satisfaction\": \"1\",\n" +
                    "    \"ruleContentName\": \"\",\n" +
                    "    \"standardSpeechId\": \"\",\n" +
                    "    \"replyDeadline\": \"0\",\n" +
                    "    \"appContentAccruacy\": \"2\",\n" +
                    "    \"mistakeLevel\": \"0\",\n" +
                    "    \"ruleContentId\": \"\",\n" +
                    "    \"busiProficiency\": \"0\",\n" +
                    "    \"repeatGroupId\": \"895b8357dd2a4305b624fbe8d7d90714\",\n" +
                    "    \"callReason\": \"0501\",\n" +
                    "    \"isComplaint\": \"2\"\n" +
                    "  },\n" +
                    "  \"workOrderData\": {\n" +
                    "    \"handleTime\": \"2018-08-10 08:23:23\",\n" +
                    "    \"cityCode\": \"510100\",\n" +
                    "    \"center\": \"7110102\",\n" +
                    "    \"appNo\": \"2018081074138681\",\n" +
                    "    \"groups\": \"5174\",\n" +
                    "    \"empNo\": \"03008949\",\n" +
                    "    \"custLevel\": \"null\",\n" +
                    "    \"countyCode\": \"510115\",\n" +
                    "    \"reqDirection\": \"02\",\n" +
                    "    \"visitFlag\": \"null\",\n" +
                    "    \"orgNo\": \"5140110\",\n" +
                    "    \"proOrgNo\": \"51101\",\n" +
                    "    \"busiType\": \"018\",\n" +
                    "    \"urbanFlag\": \"01\",\n" +
                    "    \"department\": \"711010209\",\n" +
                    "    \"busiSubType\": \"0501\"\n" +
                    "  },\n" +
                    "  \"transData\": {\n" +
                    "    \"sentenceList\": [\n" +
                    "      {\n" +
                    "        \"role\": \"USER\",\n" +
                    "        \"startTime\": \"30\",\n" +
                    "        \"endTime\": \"270\",\n" +
                    "        \"content\": \"对\",\n" +
                    "        \"speed\": \"4.16667\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"role\": \"AGENT\",\n" +
                    "        \"startTime\": \"500\",\n" +
                    "        \"endTime\": \"6490\",\n" +
                    "        \"content\": \"您好我是国家电网的工号为三八元好的客服人员请问一下您您是您女士对吧\",\n" +
                    "        \"speed\": \"5.50918\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"role\": \"USER\",\n" +
                    "        \"startTime\": \"6920\",\n" +
                    "        \"endTime\": \"7170\",\n" +
                    "        \"content\": \"嗯\",\n" +
                    "        \"speed\": \"4\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"role\": \"AGENT\",\n" +
                    "        \"startTime\": \"7120\",\n" +
                    "        \"endTime\": \"11050\",\n" +
                    "        \"content\": \"啊打扰您了前面您跟我反映关于电表的脱落问题做个回访\",\n" +
                    "        \"speed\": \"6.36132\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"role\": \"USER\",\n" +
                    "        \"startTime\": \"7320\",\n" +
                    "        \"endTime\": \"7750\",\n" +
                    "        \"content\": \"嗯\",\n" +
                    "        \"speed\": \"2.32558\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"role\": \"USER\",\n" +
                    "        \"startTime\": \"10740\",\n" +
                    "        \"endTime\": \"13610\",\n" +
                    "        \"content\": \"他们处理他们他们俩七七四就处理了\",\n" +
                    "        \"speed\": \"5.57491\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"role\": \"AGENT\",\n" +
                    "        \"startTime\": \"11480\",\n" +
                    "        \"endTime\": \"15870\",\n" +
                    "        \"content\": \"嗯那您对供电公司元春的情况您感到非常满意满意办法不满意呢\",\n" +
                    "        \"speed\": \"6.37813\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"role\": \"USER\",\n" +
                    "        \"startTime\": \"16620\",\n" +
                    "        \"endTime\": \"18790\",\n" +
                    "        \"content\": \"非常满意嗯啊也过了\",\n" +
                    "        \"speed\": \"4.14747\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"role\": \"AGENT\",\n" +
                    "        \"startTime\": \"17080\",\n" +
                    "        \"endTime\": \"20710\",\n" +
                    "        \"content\": \"嗯好谢谢您的评价欢迎再次致电九五九八再见\",\n" +
                    "        \"speed\": \"5.50964\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"role\": \"USER\",\n" +
                    "        \"startTime\": \"18940\",\n" +
                    "        \"endTime\": \"19270\",\n" +
                    "        \"content\": \"嗯\",\n" +
                    "        \"speed\": \"3.0303\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"role\": \"USER\",\n" +
                    "        \"startTime\": \"19480\",\n" +
                    "        \"endTime\": \"19830\",\n" +
                    "        \"content\": \"嗯\",\n" +
                    "        \"speed\": \"2.85714\"\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"emotionList\": [],\n" +
                    "    \"overLapDuration\": 0,\n" +
                    "    \"overlapNum\": 0,\n" +
                    "    \"silencePercent\": \"0.00\",\n" +
                    "    \"maxSilenceDuration\": 0,\n" +
                    "    \"speed\": \"5.94\",\n" +
                    "    \"duration\": 21320,\n" +
                    "    \"userContent\": \"对。嗯。嗯。他们处理他们他们俩七七四就处理了。非常满意嗯啊也过了。嗯。嗯。\",\n" +
                    "    \"allContent\": \"对。您好我是国家电网的工号为三八元好的客服人员请问一下您您是您女士对吧。嗯。啊打扰您了前面您跟我反映关于电表的脱落问题做个回访。嗯。他们处理他们他们俩七七四就处理了。嗯那您对供电公司元春的情况您感到非常满意满意办法不满意呢。非常满意嗯啊也过了。嗯好谢谢您的评价欢迎再次致电九五九八再见。嗯。嗯。\",\n" +
                    "    \"agentContent\": \"您好我是国家电网的工号为三八元好的客服人员请问一下您您是您女士对吧。啊打扰您了前面您跟我反映关于电表的脱落问题做个回访。嗯那您对供电公司元春的情况您感到非常满意满意办法不满意呢。嗯好谢谢您的评价欢迎再次致电九五九八再见。\",\n" +
                    "    \"silenceDuration\": 0,\n" +
                    "    \"effectiveDuration\": 21320,\n" +
                    "    \"silenceList\": [\n" +
                    "      {\n" +
                    "        \"startTime\": \"0\",\n" +
                    "        \"endTime\": \"30\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"startTime\": \"270\",\n" +
                    "        \"endTime\": \"500\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"startTime\": \"6490\",\n" +
                    "        \"endTime\": \"6920\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"startTime\": \"15870\",\n" +
                    "        \"endTime\": \"16620\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"startTime\": \"20710\",\n" +
                    "        \"endTime\": \"21320\"\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"invalidDuration\": 0,\n" +
                    "    \"silenceNum\": 0\n" +
                    "  },\n" +
                    "  \"UUID\": \"SB|00A502C0DBEA9C3B|841832|2018-08-13\",\n" +
                    "  \"xmlData\": \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?>\\n<result>\\n    <duration>21320</duration>\\n    <silence_list total_time=\\\"2050\\\">\\n        <silence end=\\\"30\\\" start=\\\"0\\\"/>\\n        <silence end=\\\"500\\\" start=\\\"270\\\"/>\\n        <silence end=\\\"6920\\\" start=\\\"6490\\\"/>\\n        <silence end=\\\"16620\\\" start=\\\"15870\\\"/>\\n        <silence end=\\\"21320\\\" start=\\\"20710\\\"/>\\n    </silence_list>\\n    <sentence_list>\\n        <sentence end=\\\"270\\\" index=\\\"0\\\" role=\\\"USER\\\" score=\\\"15\\\"\\n            speed=\\\"4.16667\\\" start=\\\"30\\\">\\n            <text>对</text>\\n            <word_list>\\n                <word end=\\\"250\\\" ivr=\\\"0\\\" score=\\\"15\\\" start=\\\"30\\\">对</word>\\n            </word_list>\\n            <keyword_list/>\\n            <emotion_list/>\\n        </sentence>\\n        <sentence end=\\\"6490\\\" index=\\\"1\\\" role=\\\"AGENT\\\" score=\\\"3760\\\"\\n            speed=\\\"5.50918\\\" start=\\\"500\\\">\\n            <text>您好我是国家电网的工号为三八元好的客服人员请问一下您您是您女士对吧</text>\\n            <word_list>\\n                <word end=\\\"1220\\\" ivr=\\\"0\\\" score=\\\"5892\\\" start=\\\"800\\\">您好</word>\\n                <word end=\\\"1320\\\" ivr=\\\"0\\\" score=\\\"5155\\\" start=\\\"1220\\\">我</word>\\n                <word end=\\\"1440\\\" ivr=\\\"0\\\" score=\\\"5647\\\" start=\\\"1320\\\">是</word>\\n                <word end=\\\"2100\\\" ivr=\\\"0\\\" score=\\\"7047\\\" start=\\\"1440\\\">国家电网</word>\\n                <word end=\\\"2260\\\" ivr=\\\"0\\\" score=\\\"799\\\" start=\\\"2100\\\">的</word>\\n                <word end=\\\"2630\\\" ivr=\\\"0\\\" score=\\\"4949\\\" start=\\\"2260\\\">工号</word>\\n                <word end=\\\"2840\\\" ivr=\\\"0\\\" score=\\\"2927\\\" start=\\\"2630\\\">为</word>\\n                <word end=\\\"3280\\\" ivr=\\\"0\\\" score=\\\"1641\\\" start=\\\"2840\\\">三八</word>\\n                <word end=\\\"3420\\\" ivr=\\\"0\\\" score=\\\"58\\\" start=\\\"3280\\\">元</word>\\n                <word end=\\\"3580\\\" ivr=\\\"0\\\" score=\\\"5076\\\" start=\\\"3420\\\">好</word>\\n                <word end=\\\"3660\\\" ivr=\\\"0\\\" score=\\\"3707\\\" start=\\\"3580\\\">的</word>\\n                <word end=\\\"4280\\\" ivr=\\\"0\\\" score=\\\"5068\\\" start=\\\"3660\\\">客服人员</word>\\n                <word end=\\\"4480\\\" ivr=\\\"0\\\" score=\\\"1823\\\" start=\\\"4280\\\">请问</word>\\n                <word end=\\\"4720\\\" ivr=\\\"0\\\" score=\\\"4127\\\" start=\\\"4480\\\">一下</word>\\n                <word end=\\\"4940\\\" ivr=\\\"0\\\" score=\\\"4142\\\" start=\\\"4720\\\">您</word>\\n                <word end=\\\"5160\\\" ivr=\\\"0\\\" score=\\\"3652\\\" start=\\\"4940\\\">您</word>\\n                <word end=\\\"5300\\\" ivr=\\\"0\\\" score=\\\"5980\\\" start=\\\"5160\\\">是</word>\\n                <word end=\\\"5420\\\" ivr=\\\"0\\\" score=\\\"3025\\\" start=\\\"5300\\\">您</word>\\n                <word end=\\\"5760\\\" ivr=\\\"0\\\" score=\\\"6512\\\" start=\\\"5420\\\">女士</word>\\n                <word end=\\\"5900\\\" ivr=\\\"0\\\" score=\\\"9476\\\" start=\\\"5760\\\">对</word>\\n                <word end=\\\"6220\\\" ivr=\\\"0\\\" score=\\\"5527\\\" start=\\\"5900\\\">吧</word>\\n            </word_list>\\n            <keyword_list/>\\n            <emotion_list/>\\n        </sentence>\\n        <sentence end=\\\"7170\\\" index=\\\"2\\\" role=\\\"USER\\\" score=\\\"252\\\" speed=\\\"4\\\" start=\\\"6920\\\">\\n            <text>嗯</text>\\n            <word_list>\\n                <word end=\\\"7150\\\" ivr=\\\"0\\\" score=\\\"252\\\" start=\\\"6980\\\">嗯</word>\\n            </word_list>\\n            <keyword_list/>\\n            <emotion_list/>\\n        </sentence>\\n        <sentence end=\\\"11050\\\" index=\\\"3\\\" role=\\\"AGENT\\\" score=\\\"3094\\\"\\n            speed=\\\"6.36132\\\" start=\\\"7120\\\">\\n            <text>啊打扰您了前面您跟我反映关于电表的脱落问题做个回访</text>\\n            <word_list>\\n                <word end=\\\"7400\\\" ivr=\\\"0\\\" score=\\\"4574\\\" start=\\\"7120\\\">啊</word>\\n                <word end=\\\"7710\\\" ivr=\\\"0\\\" score=\\\"6474\\\" start=\\\"7400\\\">打扰</word>\\n                <word end=\\\"7860\\\" ivr=\\\"0\\\" score=\\\"4211\\\" start=\\\"7710\\\">您</word>\\n                <word end=\\\"8000\\\" ivr=\\\"0\\\" score=\\\"4980\\\" start=\\\"7860\\\">了</word>\\n                <word end=\\\"8280\\\" ivr=\\\"0\\\" score=\\\"1651\\\" start=\\\"8000\\\">前面</word>\\n                <word end=\\\"8410\\\" ivr=\\\"0\\\" score=\\\"1405\\\" start=\\\"8280\\\">您</word>\\n                <word end=\\\"8490\\\" ivr=\\\"0\\\" score=\\\"2970\\\" start=\\\"8410\\\">跟</word>\\n                <word end=\\\"8630\\\" ivr=\\\"0\\\" score=\\\"767\\\" start=\\\"8490\\\">我</word>\\n                <word end=\\\"8880\\\" ivr=\\\"0\\\" score=\\\"5788\\\" start=\\\"8630\\\">反映</word>\\n                <word end=\\\"9100\\\" ivr=\\\"0\\\" score=\\\"2829\\\" start=\\\"8880\\\">关于</word>\\n                <word end=\\\"9480\\\" ivr=\\\"0\\\" score=\\\"6064\\\" start=\\\"9100\\\">电表</word>\\n                <word end=\\\"9620\\\" ivr=\\\"0\\\" score=\\\"7405\\\" start=\\\"9480\\\">的</word>\\n                <word end=\\\"9960\\\" ivr=\\\"0\\\" score=\\\"250\\\" start=\\\"9620\\\">脱落</word>\\n                <word end=\\\"10300\\\" ivr=\\\"0\\\" score=\\\"5822\\\" start=\\\"9960\\\">问题</word>\\n                <word end=\\\"10440\\\" ivr=\\\"0\\\" score=\\\"3649\\\" start=\\\"10300\\\">做</word>\\n                <word end=\\\"10540\\\" ivr=\\\"0\\\" score=\\\"3122\\\" start=\\\"10440\\\">个</word>\\n                <word end=\\\"10960\\\" ivr=\\\"0\\\" score=\\\"5438\\\" start=\\\"10540\\\">回访</word>\\n            </word_list>\\n            <keyword_list/>\\n            <emotion_list/>\\n        </sentence>\\n        <sentence end=\\\"7750\\\" index=\\\"4\\\" role=\\\"USER\\\" score=\\\"350\\\"\\n            speed=\\\"2.32558\\\" start=\\\"7320\\\">\\n            <text>嗯</text>\\n            <word_list>\\n                <word end=\\\"7630\\\" ivr=\\\"0\\\" score=\\\"350\\\" start=\\\"7320\\\">嗯</word>\\n            </word_list>\\n            <keyword_list/>\\n            <emotion_list/>\\n        </sentence>\\n        <sentence end=\\\"13610\\\" index=\\\"5\\\" role=\\\"USER\\\" score=\\\"732\\\"\\n            speed=\\\"5.57491\\\" start=\\\"10740\\\">\\n            <text>他们处理他们他们俩七七四就处理了</text>\\n            <word_list>\\n                <word end=\\\"10960\\\" ivr=\\\"0\\\" score=\\\"1846\\\" start=\\\"10740\\\">他们</word>\\n                <word end=\\\"11510\\\" ivr=\\\"0\\\" score=\\\"1338\\\" start=\\\"10960\\\">处理</word>\\n                <word end=\\\"11780\\\" ivr=\\\"0\\\" score=\\\"557\\\" start=\\\"11540\\\">他们</word>\\n                <word end=\\\"12010\\\" ivr=\\\"0\\\" score=\\\"2387\\\" start=\\\"11780\\\">他们</word>\\n                <word end=\\\"12280\\\" ivr=\\\"0\\\" score=\\\"17\\\" start=\\\"12010\\\">俩</word>\\n                <word end=\\\"12780\\\" ivr=\\\"0\\\" score=\\\"863\\\" start=\\\"12280\\\">七七</word>\\n                <word end=\\\"12940\\\" ivr=\\\"0\\\" score=\\\"40\\\" start=\\\"12780\\\">四</word>\\n                <word end=\\\"13080\\\" ivr=\\\"0\\\" score=\\\"1381\\\" start=\\\"12940\\\">就</word>\\n                <word end=\\\"13480\\\" ivr=\\\"0\\\" score=\\\"3858\\\" start=\\\"13080\\\">处理</word>\\n                <word end=\\\"13590\\\" ivr=\\\"0\\\" score=\\\"59\\\" start=\\\"13480\\\">了</word>\\n            </word_list>\\n            <keyword_list/>\\n            <emotion_list/>\\n        </sentence>\\n        <sentence end=\\\"15870\\\" index=\\\"6\\\" role=\\\"AGENT\\\" score=\\\"2382\\\"\\n            speed=\\\"6.37813\\\" start=\\\"11480\\\">\\n            <text>嗯那您对供电公司元春的情况您感到非常满意满意办法不满意呢</text>\\n            <word_list>\\n                <word end=\\\"11760\\\" ivr=\\\"0\\\" score=\\\"4822\\\" start=\\\"11550\\\">嗯</word>\\n                <word end=\\\"11880\\\" ivr=\\\"0\\\" score=\\\"8102\\\" start=\\\"11760\\\">那</word>\\n                <word end=\\\"12000\\\" ivr=\\\"0\\\" score=\\\"6917\\\" start=\\\"11880\\\">您</word>\\n                <word end=\\\"12140\\\" ivr=\\\"0\\\" score=\\\"5879\\\" start=\\\"12000\\\">对</word>\\n                <word end=\\\"12660\\\" ivr=\\\"0\\\" score=\\\"3467\\\" start=\\\"12140\\\">供电公司</word>\\n                <word end=\\\"13040\\\" ivr=\\\"0\\\" score=\\\"932\\\" start=\\\"12660\\\">元春</word>\\n                <word end=\\\"13160\\\" ivr=\\\"0\\\" score=\\\"286\\\" start=\\\"13040\\\">的</word>\\n                <word end=\\\"13500\\\" ivr=\\\"0\\\" score=\\\"6379\\\" start=\\\"13160\\\">情况</word>\\n                <word end=\\\"13620\\\" ivr=\\\"0\\\" score=\\\"7309\\\" start=\\\"13500\\\">您</word>\\n                <word end=\\\"13870\\\" ivr=\\\"0\\\" score=\\\"1492\\\" start=\\\"13620\\\">感到</word>\\n                <word end=\\\"14560\\\" ivr=\\\"0\\\" score=\\\"5278\\\" start=\\\"13870\\\">非常满意</word>\\n                <word end=\\\"14860\\\" ivr=\\\"0\\\" score=\\\"3337\\\" start=\\\"14560\\\">满意</word>\\n                <word end=\\\"15080\\\" ivr=\\\"0\\\" score=\\\"671\\\" start=\\\"14860\\\">办法</word>\\n                <word end=\\\"15190\\\" ivr=\\\"0\\\" score=\\\"381\\\" start=\\\"15080\\\">不</word>\\n                <word end=\\\"15520\\\" ivr=\\\"0\\\" score=\\\"1577\\\" start=\\\"15190\\\">满意</word>\\n                <word end=\\\"15850\\\" ivr=\\\"0\\\" score=\\\"255\\\" start=\\\"15520\\\">呢</word>\\n            </word_list>\\n            <keyword_list/>\\n            <emotion_list/>\\n        </sentence>\\n        <sentence end=\\\"18790\\\" index=\\\"7\\\" role=\\\"USER\\\" score=\\\"318\\\"\\n            speed=\\\"4.14747\\\" start=\\\"16620\\\">\\n            <text>非常满意嗯啊也过了</text>\\n            <word_list>\\n                <word end=\\\"17510\\\" ivr=\\\"0\\\" score=\\\"123\\\" start=\\\"16620\\\">非常满意</word>\\n                <word end=\\\"17940\\\" ivr=\\\"0\\\" score=\\\"3376\\\" start=\\\"17540\\\">嗯</word>\\n                <word end=\\\"18200\\\" ivr=\\\"0\\\" score=\\\"1490\\\" start=\\\"17980\\\">啊</word>\\n                <word end=\\\"18460\\\" ivr=\\\"0\\\" score=\\\"2345\\\" start=\\\"18230\\\">也</word>\\n                <word end=\\\"18600\\\" ivr=\\\"0\\\" score=\\\"257\\\" start=\\\"18460\\\">过</word>\\n                <word end=\\\"18770\\\" ivr=\\\"0\\\" score=\\\"47\\\" start=\\\"18600\\\">了</word>\\n            </word_list>\\n            <keyword_list/>\\n            <emotion_list/>\\n        </sentence>\\n        <sentence end=\\\"20710\\\" index=\\\"8\\\" role=\\\"AGENT\\\" score=\\\"3747\\\"\\n            speed=\\\"5.50964\\\" start=\\\"17080\\\">\\n            <text>嗯好谢谢您的评价欢迎再次致电九五九八再见</text>\\n            <word_list>\\n                <word end=\\\"17420\\\" ivr=\\\"0\\\" score=\\\"6212\\\" start=\\\"17140\\\">嗯</word>\\n                <word end=\\\"17660\\\" ivr=\\\"0\\\" score=\\\"5810\\\" start=\\\"17420\\\">好</word>\\n                <word end=\\\"18040\\\" ivr=\\\"0\\\" score=\\\"7071\\\" start=\\\"17660\\\">谢谢您</word>\\n                <word end=\\\"18160\\\" ivr=\\\"0\\\" score=\\\"7059\\\" start=\\\"18040\\\">的</word>\\n                <word end=\\\"18620\\\" ivr=\\\"0\\\" score=\\\"2150\\\" start=\\\"18160\\\">评价</word>\\n                <word end=\\\"19000\\\" ivr=\\\"0\\\" score=\\\"3619\\\" start=\\\"18620\\\">欢迎</word>\\n                <word end=\\\"19280\\\" ivr=\\\"0\\\" score=\\\"5717\\\" start=\\\"19000\\\">再次</word>\\n                <word end=\\\"19560\\\" ivr=\\\"0\\\" score=\\\"3997\\\" start=\\\"19280\\\">致电</word>\\n                <word end=\\\"20240\\\" ivr=\\\"0\\\" score=\\\"1519\\\" start=\\\"19560\\\">九五九八</word>\\n                <word end=\\\"20690\\\" ivr=\\\"0\\\" score=\\\"4422\\\" start=\\\"20240\\\">再见</word>\\n            </word_list>\\n            <keyword_list/>\\n            <emotion_list/>\\n        </sentence>\\n        <sentence end=\\\"19270\\\" index=\\\"9\\\" role=\\\"USER\\\" score=\\\"99\\\"\\n            speed=\\\"3.0303\\\" start=\\\"18940\\\">\\n            <text>嗯</text>\\n            <word_list>\\n                <word end=\\\"19170\\\" ivr=\\\"0\\\" score=\\\"99\\\" start=\\\"18940\\\">嗯</word>\\n            </word_list>\\n            <keyword_list/>\\n            <emotion_list/>\\n        </sentence>\\n        <sentence end=\\\"19830\\\" index=\\\"10\\\" role=\\\"USER\\\" score=\\\"33\\\"\\n            speed=\\\"2.85714\\\" start=\\\"19480\\\">\\n            <text>嗯</text>\\n            <word_list>\\n                <word end=\\\"19780\\\" ivr=\\\"0\\\" score=\\\"33\\\" start=\\\"19580\\\">嗯</word>\\n            </word_list>\\n            <keyword_list/>\\n            <emotion_list/>\\n        </sentence>\\n    </sentence_list>\\n</result>\\n\"\n" +
                    "}\n");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}