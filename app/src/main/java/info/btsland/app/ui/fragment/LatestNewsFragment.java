package info.btsland.app.ui.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import info.btsland.app.Adapter.NewsAdapter;
import info.btsland.app.R;
import info.btsland.app.model.News;
import info.btsland.app.ui.activity.NewsContentActivity;


public class LatestNewsFragment extends Fragment implements AdapterView.OnItemClickListener {
    private ListView newsTitleListView;
    private List<News> newsList;
    private NewsAdapter adapter;
    private boolean isTwoPane;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        //初始化新闻数据
        newsList = getNews();
        adapter = new NewsAdapter(activity, R.layout.activity_newsitem, newsList);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //加载fragment_newstitle.xml 布局
        View view = inflater.inflate(R.layout.fragment_latest_news, container, false);
        //得到ListView的实例
        newsTitleListView = (ListView) view.findViewById(R.id.news_latest_view);
        //启动ListView的适配器，这样ListView就能与适配器的数据相关联了
        newsTitleListView.setAdapter(adapter);
        //为ListView中的子项设置监听器
        newsTitleListView.setOnItemClickListener(this);
        return view;
    }

    @Override
    //ListView子项目的点击事件
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        News news = newsList.get(position);
        //如果是单页模式（手机），就启动一个新的活动去显示新闻内容。
        Intent intent = new Intent(getActivity(), NewsContentActivity.class);
        intent.putExtra("news", news);
        getActivity().startActivity(intent);
    }


    private List<News> getNews() {
        //初始化新闻标题及内容
        List<News> newsList = new ArrayList<News>();

        News new8 = new News();
        new8.setTitle("韩国央行行长：比特币是商品而非货币，央行需加强对虚拟货币的研究");
        new8.setDate("2017-10-26");
        new8.setTitleContent("北京时间10月26日消息，韩国央行行长Lee Ju-yeol近日否决了比特币的货币属性，而是将这类加密货币归类为一种商品。据汉城联合通讯社报道，Lee行长否定了接受加密货币作为法定货币的可能性。这项声明是在韩国禁止ICO后，由官方发布的针对加密货币技术的最新评估。“对虚拟货币进行监管是合适的，因为它们属于商品，而不是法定货币，” Lee在韩国国民议会举办的一次政府审计会议上表示。");
        new8.setContent("北京时间10月26日消息，韩国央行行长Lee Ju-yeol近日否决了比特币的货币属性，而是将这类加密货币归类为一种商品。\n" +
                "\n" +
                "据汉城联合通讯社报道，Lee行长否定了接受加密货币作为法定货币的可能性。这项声明是在韩国禁止ICO后，由官方发布的针对加密货币技术的最新评估。\n" +
                "\n" +
                "“对虚拟货币进行监管是合适的，因为它们属于商品，而不是法定货币，” Lee在韩国国民议会举办的一次政府审计会议上表示。\n" +
                "\n" +
                "Bank Of Korea Governor Lee Ju Yeol At Rate Decision Meeting As Key Rate Held Steady To Gauge Budget Impact\n" +
                "\n" +
                "“就目前而言，韩国央行并不适合采取这样的行动，”他补充说。\n" +
                "今年以来，韩国交易所的交易量呈现了爆发式的增长。早在八月份时，一些国会议员主张加强监管韩国地区的加密货币交易所。上个月，该国的金融监管机构采取了引人注目的监管措施，打击了ICO融资活动。\n" +
                "\n" +
                "在这次立法会议期间， Lee也承认韩国央行可更多地围绕加密货币及区块链进行研究。\n" +
                "\n" +
                "“我们还提及很多其他国家进行当中的虚拟货币研究，例如瑞典。韩国央行也将更重视对虚拟货币的研究，” Lee总结说。");
        newsList.add(new8);

        News new1 = new News();
        new1.setTitle("穆迪：区块链和加密货币的颠覆潜力不可避免");
        new1.setDate("2017-10-26");
        new1.setTitleContent("亚洲第一信用评级机构穆迪（Moody’s）投资者服务中心安慰美国支付领域，区块链和加密货币能构成的“威胁”距离我们还很“遥远”，但最终各个企业还是会采用这项技术。穆迪分析师斯蒂芬•索恩（Stephen Sohn）及其团队在本月中发表了一篇名为《消费者数字支付——美国》的报告，他们在报告中安慰支付领域参与者，区块链技术是一个“遥远的威胁”。");
        new1.setContent("亚洲第一信用评级机构穆迪（Moody’s）投资者服务中心安慰美国支付领域，区块链和加密货币能构成的“威胁”距离我们还很“遥远”，但最终各个企业还是会采用这项技术。\n" +
                "\n" +
                "穆迪分析师斯蒂芬•索恩（Stephen Sohn）及其团队在本月中发表了一篇名为《消费者数字支付——美国》的报告，他们在报告中安慰支付领域参与者，区块链技术是一个“遥远的威胁”。\n" +
                "\n" +
                "穆迪认为，区块链技术作为一个颠覆者，将会给支付领域构成潜在的长期竞争威胁。该公司在报告中提到了一些“以技术为依托的竞争者”，他们正在改革美国的电子支付领域。\n" +
                "\n" +
                "报告指出：\n" +
                "\n" +
                "区块链技术最初是比特币这个加密货币的运作基础，目前正在考虑采用这项技术的公司可能对当前支付领域所有的参与者带来潜在威胁。区块链是由区块构成的链条式组合，区块中包含了加密信息，从而形成了一个数据库或‘账本’，最终，目前负责支付审核、清算和结算的中介平台将不再有存在的必要。\n" +
                "在当前主流支付条件受限的情况下，比特币这个加密货币是作为另一种支付系统选择而存在的，它能够移除中心化机构，不再需要他们进行交易和支付审核。除此之外，区块链技术在处理高吞吐量交易方面的能力未经证实，而当前系统需要秒级的处理能力。一旦这项技术证明其在支付领域的应用前景，我们将会看到越来越多的企业接纳它。\n" +
                "\n" +
                "区块链与金融服务业\n" +
                "\n" +
                "穆迪副总经理肖恩•琼斯（Sean Jones）及其团队在今年4月的一篇报告中认可了区块链技术除比特币以外还存在一系列“潜在应用与优势”。\n" +
                "\n" +
                "Jones提到，这项技术能够改革清算和结算领域，他还强调，区块链可以“提高交易透明度及数据安全性，同时降低单点故障”。\n" +
                "\n" +
                "区块链技术部署之后，预计交易后流程就会面临改革。不过，在对区块链技术进行投资之前还需要克服一系列阻碍。其中就包括延展性和互通性等技术问题，行业标准以及合作方式也需要尽快实现统一。\n" +
                "\n" +
                "穆迪强调，金融服务领域的监管部门对区块链基本上是持支持态度的，但至于最终他们将针对这项技术出台怎样的政策就很难说了。");
        newsList.add(new1);

        News new7 = new News();
        new7.setTitle("到2027年，每家公司都将使用区块链技术，原因在这里");
        new7.setDate("2017-10-26");
        new7.setTitleContent("大约10年以前，比特币之父中本聪发表了一份长达8页的调查报告，解释了比特币如何实现货币的去中心化。这一报告悄无声息地扰乱了银行等信用机构的运行。但那时并没有多少人理解这八页报告蕴含的潜力。但我所要讲的并不是货币的去中心化，而是去中心化本身。在这八页报告中，中本聪不仅揭示了人们如何重新获得对自己资金的控制权，而且还为陌生人之间的合作提供了新的方案。");
        new7.setContent("大约10年以前，比特币之父中本聪发表了一份长达8页的调查报告，解释了比特币如何实现货币的去中心化。这一报告悄无声息地扰乱了银行等信用机构的运行。但那时并没有多少人理解这八页报告蕴含的潜力。\n" +
                "\n" +
                "但我所要讲的并不是货币的去中心化，而是去中心化本身。在这八页报告中，中本聪不仅揭示了人们如何重新获得对自己资金的控制权，而且还为陌生人之间的合作提供了新的方案。\n" +
                "\n" +
                "也许你遇到过否定区块链接技术的人，他们还劝你别为这种”炒作”买单。然而，我的意见是：别太在意这种人。\n" +
                "\n" +
                "不能适应未来去中心化世界的企业只能被淘汰。\n" +
                "在这篇文章中，我将从五个不同的方面讨论区块链接技术在未来不到10年的时间内将如何融入你的公司。先让我们从最基本的问题开始：究竟什么是区块链接技术？\n" +
                "\n" +
                "简单来说，一条区块链就是一个数据库，一个由不同数据组成的不断增加的数据库。它具有如下显著功能：\n" +
                "\n" +
                "数据一经保存就无法更改或删除。区块链中的每项纪录都具有永久性。\n" +
                "它是由成千上万的人共同维护的，而不是个别组织或个人。每一位运行着都有一份该数据库的备份。\n" +
                "为了了解如何使不同人手中的数据库备份保持同步，请想象一下：\n" +
                "\n" +
                "十个人处在同一个网络中。每个人面前都有一个文件夹和一张白纸。这个网络中的任何人所进行的，如转账之类的重要活动都要同志网络中的其他人。\n" +
                "\n" +
                "每一个人都将每一项通知记录在自己的白纸上，指导将白纸写满。当白纸被填满时，每个人都要通过”解数学题”的方式将白纸”密封”。这一”解题过程”会审核每个人纸上记录的内容是否一致，确保这些内容不会被篡改。第一个完成”密封”的人会得到加密货币的奖励。\n" +
                "\n" +
                "密封好的纸会被放入文件夹中，新的白纸会被拿出来重复这一过程，如此不断。\n" +
                "\n" +
                "随着时间的推移，越来越多的包含重要记录（交易记录）的纸张会被放入文件夹（链条）内，由此形成数据库（区块链）。\n" +
                "\n" +
                "由于功能独特，区块链技术可以应用到从银行业，会计业到娱乐业等不同产业\n" +
                "\n" +
                "下面，我们将从五个不同方面讨论区块链技术将如何影响你的公司。\n" +
                "\n" +
                "1）合约\n" +
                "\n" +
                "“合约签订之前，谈什么都不是真实的。”- 格伦·丹泽\n" +
                "不能被履行合约的公司还算什么公司？区块链技术将会对公司企业之间的交往方式产生巨大的影响。做生意意味着一方与另一方做交易，来完成单独一方不可能完成的任务。在这种条件下，双方要获得彼此的信任。\n" +
                "\n" +
                "目前，这种信任是建立在一系列文件或者是合约的基础上的，上面列出了双方约定的基本条款。当一方不遵守合约中列出的条款时，该方会收到法律制裁，但是这一过程既耗时又耗财。所以很多情况下因为违反合约而闹到法庭并不值得。\n" +
                "\n" +
                "运用区块链技术可以将很多合约转化为智能合约。与传统合约不同，智能合约是由软件代码构成的并且在区块链网络中执行。智能合约的魅力就在于合约一旦执行就不能被修改，这就保证了合同中的任何一方都必须履行自己的义务。\n" +
                "\n" +
                "智能合约以代码的形式记录在区块链中，一旦被激活就完全不能修改。\n" +
                "\n" +
                "假设你是一名乐队成员，你想把你们的音乐卖给别人，也就是说你得传送一份音频文件给对方。你怎么肯定买家在收到文件后会付钱给你呢？买家也可能会心存怀疑，认为如果他先付钱给你，你也许不会给他发送这份音频文件。智能合约保证了只要买家完成转账，音频文件会立即发送给买家。合约一旦实施，双方都不可能阻止合约的执行。双方都可以信任代码。\n" +
                "\n" +
                "2）付款\n" +
                "\n" +
                "“如果你认为没人在乎你，那不妨试试逃帐。”-史蒂夫·赖特\n" +
                "如果你的公司涉及到付款，区块链也能在跨国交易中派上用场。区块链技术最大的前景之一就是未来某一天它会取代货币。当然，这肯定需要一场巨大的变革，这场变革可能会在好几年，甚至几十年之后才会发生。但是现在，我们已经能够运用区块链技术在全球范围内进行转账，这一过程几分钟就可以完成。\n" +
                "\n" +
                "货币去中心化的一个好处就是付款可以由交易双方直接完成，没有银行之类的任何中间人耽误时间。考虑到这一点，跨国汇款无疑将成为区域链技术应用的另一个领域。\n" +
                "\n" +
                "3）雇佣）\n" +
                "\n" +
                "“我们将成为机器人的保姆，这就是下一代工作的形式。”-葛雷·斯科特\n" +
                "专家语言机器人有朝一日会接管我们的工作。但是那一天到来之前，任何一家公司的总裁都需要人类来管理他们的公司。\n" +
                "\n" +
                "与机器人不同，人类没有商标或名誉标记，因此，为你的公司找到合适的雇员是一项艰巨的任务。\n" +
                "\n" +
                "如果有关未来新雇员的信息被公开共享，情况会不会不一样呢？就像这篇文章前面谈到过的，区块链技术为更快捷、更经济、无信任相关的（不必向任何人求证资料的真实性）背景调查方式铺平了道路。每一名雇员都有以往雇主所提供的一连串的工作反馈。新雇主可以快速浏览这一串反馈并由此判断这个人是否适合这个工作岗位。\n" +
                "\n" +
                "这对于雇主来说的确很方便，但如果这串反馈中含有错误信息会怎样呢？假如你的前雇主是一个可恶又可怕的人，你会被他所给的负面评价困扰一生吗？\n" +
                "\n" +
                "为了保证这种情况不会发生，这个推荐系统应该被设计成双向系统。这样一来，雇员也可以评价他们的雇主，必要的话，他们可以进行互评。名声不好的雇主给出的负面评价与那些值得信任的雇主给出的评价相比就没有那么重的份量。\n" +
                "\n" +
                "4) 云储存\n" +
                "\n" +
                "“云的后边还是云”-朱迪·加兰\n" +
                "如果你在经营一家企业，你成功的机遇就在藏在储存在云端的电脑数据中。云服务公司BCSG 的报告显示：越来越多的中小型企业开始使用云计算。目前64% 的小型企业平均拥有三套云解决方案，而在接下来的三年时间里，这个方案的普及率将提升到 77%。\n" +
                "\n" +
                "区块链技术在云储存去中心化过程中起到了重要的作用，因为他为陌生人提供了合作平台。以前只能把文件储存在一个单一的集中服务器中，有了区块链技术就能把你的文件储存在全球范围内上千种不同的设备中。\n" +
                "\n" +
                "它的工作原理如下：你上传的每一份文件都会被分开储存进若干小内存块中，每一块小内存块又会被储存在网络中若干不同的设备中。哪一块内存块储存在哪一个设备中都被记录在区域链中。如果你想取回文件，系统会根据指令将其重组。\n" +
                "\n" +
                "比起云储存，你的信息在去中心化的储存技术中更加安全。集中的云储存会将你的文件备份好几份，可是相比之下，去中心化的储存方式会将你的数据储存在更多的设备里，因此具有更高的可靠性。\n" +
                "\n" +
                "在集中化的储存系统中，系统的储存能力取决于一家公司服务器的安全性有多高。如果去中心化的网络，就没有任何一个设备储存完整的文件，这样黑客就无法获得完整数据。\n" +
                "\n" +
                "5）更少的等级，更优的管理\n" +
                "\n" +
                "公司只有在权力掌握在多数人手中的情况在才会繁荣\n" +
                "目前的权力结构是协调较大集群的过程中办事不力的结果。区块链本身并不是一项新技术，它只是近几十年来两种技术的结合：对等网络技术和密码学。而建立在区块链技术基础上的运行方案则是由若干不断运动的部分一同和谐运作构成的。\n" +
                "\n" +
                "通过运用一套在区块链基础上建立的智能合约，各群体可以实现无等级管理。很有可能你的生意会变得和官僚主义毫无关系，所有和组织有关的重大决议都会由在区块链上举行的透明投票过程决定。\n" +
                "\n" +
                "以智能合约形式提交的每一项提案都会以大家投票的方式表决。如果赞成票达到了公司了公司规定的门槛，该提案就正式通过，可以采取进步一措施。\n" +
                "\n" +
                "区块链技术即将来临……\n" +
                "\n" +
                "以上就是你的公司可能采用区块链技术的几个区域，它可能来的比你预计的还要快，还有很多你意想不到的可能性。你还可以用下面几种思维模式来思考区块链技术。当谈到区块链技术在商业中的潜力，我倾向于把它当成是让陌生人一起工作的方法。不管是你的员工、你的商业伙伴、你的供应商或是别的什么人，区块链都会以不止一种方式迅速渗透你的组织。");
        newsList.add(new7);

        News new6 = new News();
        new6.setTitle("香港金管局与新加坡金管局宣布达成区块链合作，双方区块链贸易金融平台将联合");
        new6.setDate("2017-10-25");
        new6.setTitleContent("香港金融管理局（HKMA）与新加坡金融管理局（MAS）（具有中央银行职能）宣布他们计划将他们正在使用区块链技术开发的贸易金融平台连接在一起，从而减少在万亿美元国际贸易融资中的潜在欺诈和错误。2016年末，香港金融管理局（HKMA）与包括汇丰银行和渣打银行在内的银行测试了使用分布式账本技术（区块链技术）创建一个贸易融资平台。新加坡也正在开发一个类似的平台。");
        new6.setContent("香港金融管理局（HKMA）与新加坡金融管理局（MAS）（具有中央银行职能）宣布他们计划将他们正在使用区块链技术开发的贸易金融平台连接在一起，从而减少在万亿美元国际贸易融资中的潜在欺诈和错误。\n" +
                "\n" +
                "2016年末，香港金融管理局（HKMA）与包括汇丰银行和渣打银行在内的银行测试了使用分布式账本技术（区块链技术）创建一个贸易融资平台。新加坡也正在开发一个类似的平台。\n" +
                "\n" +
                "HKMA与新加坡金融管理局（MAS）在联合发布的声明中表示，这两个平台的联合是他们进行更广泛区块链与其他金融技术项目合作计划的一部分。\n" +
                "\n" +
                "HKMA主管Norman Chan在一场金融技术会议上表示：\n" +
                "\n" +
                "“这个接口可能是全球第一种分布式账本技术应用，解决了基于纸质的贸易金融系统的效率低下所引发的百年问题。\n" +
                "此时还正值包括汇丰银行和美国美林银行以及政府机构（如新加坡资讯通信发展管理局）寻求使用这种技术实现贸易金融更加高效并减少信用证和其他交易欺诈。\n" +
                "\n" +
                "信用证是进出口商最常用的一种降低贸易风险的方式，为全球2万亿美元的交易提供了保证，但是这个流程造成了一种很长的纸质文件跟踪并且非常耗时。\n" +
                "\n" +
                "Chan表示HKMA的项目能够实现贸易文件数字化，流程自动化，并且允许在获得授权的参与者之间共享所需要的文件，减少人类错误以及欺诈风险。\n" +
                "\n" +
                "他还表示，HKMA和这些银行现在正在招聘一位开发者来创建并实现该平台的商业化。");
        newsList.add(new6);

        News new5 = new News();
        new5.setTitle("贵州省区块链标准工作组会议召开 拟将五个领域区块链应用标准化");
        new5.setDate("2017-10-25");
        new5.setTitleContent("10月24日，由贵州省大数据发展管理局、贵阳市人民政府共同发起成立的贵州省区块链标准建设指导协调组和贵州省区块链标准工作组，在贵阳国家高新区召开了“贵州省区块链标准工作组会议”，组织开展区块链标准研制工作。得天独厚 区块链标准化尽享优势");
        new5.setContent("10月24日，由贵州省大数据发展管理局、贵阳市人民政府共同发起成立的贵州省区块链标准建设指导协调组和贵州省区块链标准工作组，在贵阳国家高新区召开了“贵州省区块链标准工作组会议”，组织开展区块链标准研制工作。\n" +
                "\n" +
                " \n" +
                "\n" +
                "得天独厚 区块链标准化尽享优势\n" +
                " \n" +
                "\n" +
                "贵阳市政府副秘书长、贵阳区块链发展运用指挥部常务副指挥长刘小龙用了三词六字来概括贵阳市区块链发展的三条主线，勾勒出区块链标准化得天独厚的先决条件：\n" +
                "\n" +
                "技术\n" +
                "\n" +
                "由于区块链技术的飞速发展和演变更新，目前贵阳市区块链仍处在“华山论剑”的状态。在政府的大力号召和引进下，各技术流派的区块链应用场景在贵阳相继落地，区块链测试平台层出不穷。今年2月，贵阳市联合工信部电子五所共同打造贵阳市区块链测试中心，搭建了区块链测试平台。平台围绕区块链企业与产品测试，立足贵阳，面向全国，为区块链企业提供专业的第三方测试和信息化技术服务;同时，为政府部门提供政策、法规制定和产业发展相关的技术支撑，促进贵阳市区块链发展。\n" +
                "\n" +
                "政策\n" +
                "\n" +
                "2016年，贵阳市历时三个月出台了全国第一部地方政府支持区块链发展的若干政策——《贵阳区块链发展和应用白皮书》，谋划贵阳区块链发展顶层设计，虽然离指挥部的期望还有一定差距，但已经打下扎实的工作基础。在政策执行的过程中，贵阳区块链发展如同进入了一个“无人区”，因为缺少可供参考的依据和实例，困难和疑问源源不断。即便如此，时隔一年后的今天，区块链在贵阳的初探仍然取得了阶段性的成果：区块链产业创新基金发起，区块链产业组织成立，主权区块链实施技术规范发布，一系列区块链应用场景推出……都引起了国内强烈反响，受到业内人士的高度关注。\n" +
                "\n" +
                "应用\n" +
                "\n" +
                "应用是推动区块链健康稳步发展的至关要点。现阶段贵阳市着力于区块链的应用发展，眼下虽已明确了12个区块链应用场景，但仍需各方努力。部分区块链的龙头企业也陆续和地方政府、银行合作成立了协同创新中心，整合各方资源，共同探索驱动区块链应用落地的新方法。旨在构建政、民、商三用，多场景交织的区块链应用模式，利用优势互补，促进区块链主体之间的交流和合作，有效推进区块链共享共建，打造区块链研究与应用产业生态。\n" +
                "\n" +
                " \n" +
                "\n" +
                "不忘初心 区块链标准化势在必行\n" +
                " \n" +
                "\n" +
                "“以区块链运用标准的研制和推广为切入点来推动贵阳区块链的发展，为国家区块链行业做贡献——这是贵阳的初心，也是我们一直为之努力的方向。”刘小龙表示。\n" +
                "当前国内区块链发展面临新的形势和窘境，尤其自9月4日七部委发布《防范代币发行融资风险的公告》以来，区块链行业面临着前所未有的挑战，而区块应用又是一个迫切趋势。无规矩不成方圆，目前区块链的应用技术良莠不齐，区块链标准化势在必行，不管是政策出台以前的发行代币，还是风险投资，其核心目的都是要推动区块链应用标准的成型，为区块链的发展和壮大树立正确的风向标，方不忘初心。\n" +
                "\n" +
                " \n" +
                "\n" +
                "不为技术而技术 要为应用而技术\n" +
                " \n" +
                "\n" +
                "中国电子技术标准化研究院主持了本次贵州省区块链标准研制，其区块链研究室主任李鸣会后接受了数据观的采访。为区块链需求方检测区块链技术是否达到应用要求，这是本次标准化工作最根本的目的，李鸣表示：“我们不是为了技术而技术，而是为了应用而技术。”标准化是区块链应用在一个阶段内的总结升华，经过标准化的过程，既优化了区块链的现有水平，又引领下一步区块链的技术和应用发展。区块链标准化对于具体的区块链应用场景，形成了一个针对性指导和系统的支持。\n" +
                "\n" +
                "今年5月，中国首个区块链标准《区块链参考架构》发布，统一了当前大家对区块链的认识，对于区块链产业生态发展意义重大。本次区块链应用标准化研制是继《区块链参考架构》后的又一区块链里程碑。应用标准化基于前期政策、研究、场景三方面的积累，对前面的工作进行了提炼，将宏观手段具象化，对下一步区块链工作具有聚焦性指引。“这个作用是不可替代的，因为政策是宏观上的平台手段，但要真正解决企业问题，我们需要的是一个标准告诉大家该做什么，怎么去做，如何衡量做得好不好。”李鸣告诉数据观记者。\n" +
                "\n" +
                "会上，来自全国30多家与会企业的专家，通过分组讨论的形式，发挥各家所长，有针对性地群策群力，将分别围绕《区块链应用指南》、《区块链系统测评和选型规范》、《基于区块链的数据共享开放要求》、《基于区块链的精准扶贫实施指南》、《基于区块链的数字资产交易实施指南》五个区块链应用领域的标准化开展为期四天的商榷和拟定，草案预计于27日下午完成;按照“急用先行，共性先上”的原则，计划于2018年前完成重点标准的征求意见稿，积极推动贵州省区块链政用、民用、商用发展，构建区块链应用标准体系。");
        newsList.add(new5);

        News new3 = new News();
        new3.setTitle("以投资者利益为先，马耳他政府出台加密货币投资基金管理规则");
        new3.setDate("2017-10-25");
        new3.setTitleContent("马耳他政府提出的加密货币投资基金规则目前正在公示阶段。马耳他金融服务管理局（MFSA）本周一公布了一份指南，用于指导专业投资机构招募投资者、管理风险以及进行自我管理。这份指南在下月的咨询阶段过后将面临进一步的修改，这也是马耳他政府为这项技术部署的最新的国家政策改进。MSFA在声明中表示，这份指南将适用于各种投资基金类型。");
        new3.setContent("马耳他政府提出的加密货币投资基金规则目前正在公示阶段。\n" +
                "\n" +
                "马耳他金融服务管理局（MFSA）本周一公布了一份指南，用于指导专业投资机构招募投资者、管理风险以及进行自我管理。这份指南在下月的咨询阶段过后将面临进一步的修改，这也是马耳他政府为这项技术部署的最新的国家政策改进。\n" +
                "\n" +
                "MSFA在声明中表示，这份指南将适用于各种投资基金类型。\n" +
                "\n" +
                "MFSA正在制定一系列规则，旨在监管专业投资者基金（PIF），这类基金以虚拟货币为投资目标。MFSA目前正在考虑是否允许另类投资基金（AIF）和特定另类投资基金（NAIF，马耳他独创的投资基金类型）投资虚拟货币。\n" +
                "该国政府表示，他们将在11月10日之前接受潜在利益相关者提出的意见，之后就会审核结果并对具体的规则作出相应的调整。\n" +
                "\n" +
                "这一监管部门表示，最终他们将从投资者保护的角度制定出全新的规则。\n" +
                "\n" +
                "制定这一系列新规则的目标是在涉及虚拟货币的环境下，保护投资者的利益以及金融市场的诚信。");
        newsList.add(new3);

        News new2 = new News();
        new2.setTitle("银行有阻区块链创业公司发展？英国金融行为监管局（FCA）如是说");
        new2.setDate("2017-10-25");
        new2.setTitleContent("近期，英国金融行为监管局（FCA）发布了一份评估报告，指责金融机构对分布式账本技术创业公司带来了不便。 FCA指出英国银行“批量地拒绝为某些客户提供银行账户服务”报告讨论了FCA建立“沙箱监管”一年来所取得的成就及经验教训，并指责了金融机构有意拒绝为区块链技术公司提供银行服务。");
        new2.setContent("近期，英国金融行为监管局（FCA）发布了一份评估报告，指责金融机构对分布式账本技术创业公司带来了不便。\n" +
                "\n" +
                " \n" +
                "\n" +
                "FCA指出英国银行“批量地拒绝为某些客户提供银行账户服务”\n" +
                " \n" +
                "\n" +
                "en\n" +
                "\n" +
                "报告讨论了FCA建立“沙箱监管”一年来所取得的成就及经验教训，并指责了金融机构有意拒绝为区块链技术公司提供银行服务。\n" +
                "\n" +
                "FCA指出，“我们亲眼目睹了前两批沙箱计划中的不少公司遭到了银行的拒绝，对于那些分布式账本支付公司而言，尤其困难。”\n" +
                "\n" +
                "“某类型的申请公司似乎是一律拒绝”，FCA指出并补充说，\n" +
                "\n" +
                "“个别的银行中如何评估和审批服务方面，存在明显的不一致”。\n" +
                "\n" +
                "FCA表示，在一系列因素之中，银行部门拒绝向DLT公司提供服务的决定，是由“战略商业决策”驱动的。\n" +
                "\n" +
                " \n" +
                "\n" +
                "FCA强调消极的银行服务，将会给初生的区块链行业带来负面影响\n" +
                " \n" +
                "\n" +
                "FCA指出，目前的银行业务和“创新”存在着竞争。\n" +
                "\n" +
                "FCA声称，“哪怕在沙箱中进行测试，如果某些公司无法拥有安全的银行账户，那么他们有可能无法满足我们的条件，就无法进入市场。”报告称：“一些企业由于被银行剥夺了获取金融服务的机会，无法按原计划进行测试。\n" +
                "\n" +
                " \n" +
                "\n" +
                "洗钱风险和区块链技术\n" +
                " \n" +
                "\n" +
                "FCA称，金融机构多次以区块链技术存在洗钱风险为由，拒绝向DLT公司提供基本服务。\n" +
                "\n" +
                "FCA拒绝了这一观点，其还补充说：\n" +
                "\n" +
                "“FCA的工作，是确保英国的金融体系环境对洗钱者而言是不利的。”");
        newsList.add(new2);

        News new9 = new News();
        new9.setTitle("区块链即服务（BaaS）：IBM，微软与亚马逊形成三足鼎立之势");
        new9.setDate("2017-10-25");
        new9.setTitleContent("什么是区块链即服务？根据《区块链革命》一书的作者Don Tapscott和Alex Tapscott的定义，区块链技术是一种不会腐败的经济交易数字账本，不仅能够编写用于记录金融交易，而且还包括几乎任何有价值的东西。区块链是一种加密货币的所有交易的一个账本或名单，是比特币和其他加密货币的底层技术。对于区块链技术本身，它拥有无数应用，从银行服务到物联网（IoT）。");
        new9.setContent("什么是区块链即服务？\n" +
                " \n" +
                "\n" +
                "根据《区块链革命》一书的作者Don Tapscott和Alex Tapscott的定义，区块链技术是一种不会腐败的经济交易数字账本，不仅能够编写用于记录金融交易，而且还包括几乎任何有价值的东西。\n" +
                "\n" +
                "区块链是一种加密货币的所有交易的一个账本或名单，是比特币和其他加密货币的底层技术。对于区块链技术本身，它拥有无数应用，从银行服务到物联网（IoT）。\n" +
                "\n" +
                "在未来几年，Business Insider的研究服务BI Intelligence预计各个公司都会开始充实并具体化他们的区块链IoT解决方案。不过，一些企业已经推出了他们的区块链即服务。\n" +
                "\n" +
                " \n" +
                "\n" +
                "IBM区块链技术\n" +
                " \n" +
                "\n" +
                "IBM Blockchain通过利用一种高度安全的，共享的和复制的账本准许企业公司将其交易工作流程数字化。IBM Blockchain是一种公共云服务，客户可用于构建安全的区块链网络。\n" +
                "\n" +
                "IBM Blockchain已经加入了由Linux基金会领导的超级账本项目（Hyperledger）来改进这种区块链的早期形式。\n" +
                "\n" +
                "IBM Blockchain平台自称是第一种完全整合的企业级区块链平台，设计用来加速多机构商业网络的发展、治理和运营。\n" +
                "\n" +
                "IBM声称他们的区块链产品是以一种高度可审计的方式建立的，可跟踪网络中发生的所有活动，让管理人员可以在出现错误时进行审计跟踪。\n" +
                "\n" +
                " \n" +
                "\n" +
                "微软Azure区块链技术\n" +
                " \n" +
                "\n" +
                "微软Azure的区块链即服务声称，通过试验新的业务流程为组织机构提供了一种速度快，成本低，风险低和快速失败平台，由一个拥有行业内最大的合规投资组合的云平台提供支持。\n" +
                "\n" +
                "作为一种开放，灵活且可扩展的平台，微软Azure声称支持了越来越多的分布式账本技术，解决了在安全性，性能和运营流程方面的特殊业务和技术需求。\n" +
                "\n" +
                "他们还声称他们的智能服务，如Cortana Intelligence，能够提供不同于任何其他平台产品的独特数据管理和分析能力。\n" +
                "\n" +
                "最近，微软成为了加密货币与合约倡议（IC3）的成员。通过这个成员关系，微软预计推动企业级区块链准备就绪，并与IC3团队在密码学，博弈论、分布式系统、编程语言和系统的安全性方面进行合作。\n" +
                "\n" +
                " \n" +
                "\n" +
                "亚马逊AWS区块链技术\n" +
                " \n" +
                "\n" +
                "亚马逊几乎无处不在。这个科技巨头将自己的爪子深深地伸向了全球几乎所有的经济领域，从房地产到食品再到药品，如今还有区块链技术。\n" +
                "\n" +
                "回到2016年，亚马逊云计算业务——亚马逊网络服务（AWS）与投资公司数字货币集团（DCG）达成合作为企业提供一种区块链即服务试验环境。\n" +
                "\n" +
                "双方希望通过合作提供一种服务从而使DCG投资组合中的区块链供应商能够在一种安全的环境下与客户合作，这些客户包括金融机构，保险公司，企业技术公司。\n" +
                "\n" +
                "根据AWS全球金融服务业务开发主管Scott Mullins所说，AWS正在与金融机构和区块链供应商合作刺激创新和推动无摩擦试验。\n" +
                "\n" +
                " \n" +
                "\n" +
                "R3 Corda区块链技术\n" +
                " \n" +
                "\n" +
                "R3意识到分布式账本技术的力量在于其网络效应，R3因此就与这个行业合作建立了最大行业合作组织（100多家金融机构成员）——然后推出了Corda平台。\n" +
                "\n" +
                "R3 Corda是一个为金融行业打造的专业分布式账本平台，为企业提供了API和代码用于创建类区块链的应用，并且旨在现有全球金融市场创建更多高效性。\n" +
                "\n" +
                "凭借Corda，参与者能够无需中央机构的参与就能进行交易，创建了一种无摩擦的商业世界。\n" +
                "\n" +
                "Corda代表着银行，保险商，基金经理和其他参与者之间的最大共享合作，共同研究区块链技术在金融市场的应用。\n" +
                "\n" +
                "根据Coindesk报道，日本金融巨头瑞穗金融集团打算使用Corda来“实现信用证和提单发票等文件的数字化”，他们认为这个流程能够减少欺诈，增加透明性并且加强摆脱对纸质记录的依赖。\n" +
                "\n" +
                "最近，R3发布了Corda 1.0版本，这是R3联盟两年的成果，超过一半的联盟成员为代码做出了贡献。\n" +
                "\n" +
                "2017年5月份，押注分布式账本技术的大型金融机构宣布为R3区块链联盟提供1.07亿美元资金，用于全球技术发展以及将Corda企业版带给全球机构。\n" +
                "\n" +
                " \n" +
                "\n" +
                "区块链即服务市场趋势\n" +
                " \n" +
                "\n" +
                "截止2017年2月份，“区块链”这个术语的搜索量已经在Gartner.com排名第二，在过去12个月增长了400%。在2015年到2016年，Gartner客户咨询数量增长了超过600%，证明了行业对这个快速发展的市场的兴趣正在日益增长。\n" +
                "\n" +
                "区块链市场到2012年的年复合增长率（CAGR）预计将达到61.5%，透明度和不可更改性都将成为区块链市场指数增长的推动因素。\n" +
                "\n" +
                "科技巨头们纷纷加入了这一行列，正在通过他们内部建立的平台和合作提供区块链即服务（BaaS）。\n" +
                "\n" +
                "区块链即服务预计将会进一步发展并成为金融技术行业最新的变革，如果你想要参与这场加密技术运动中的竞争和区块链即服务的大规模采用，那么BaaS就应该在你的雷达扫描范围内。");
        newsList.add(new9);

        return newsList;
    }
}