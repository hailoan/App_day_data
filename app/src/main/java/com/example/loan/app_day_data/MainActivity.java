package com.example.loan.app_day_data;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button nammoi, noel, tinhyeu, sinhnhat, phunu;
    FirebaseDatabase database;
    ArrayList<String> nammoils = new ArrayList<>();
    ArrayList<String> noells = new ArrayList<>();
    ArrayList<String> valentinels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updatanoeltext();
        updatavalentinetext();
        database = FirebaseDatabase.getInstance();
//xin chao
        nammoi = (Button) findViewById(R.id.nammoi);
        noel = (Button) findViewById(R.id.noel);
        sinhnhat = (Button) findViewById(R.id.sinhnhat);
        tinhyeu = (Button) findViewById(R.id.tinhyeu);
        phunu = (Button) findViewById(R.id.phunu);
        nammoi.setOnClickListener(this);
        noel.setOnClickListener(this);
        sinhnhat.setOnClickListener(this);
        phunu.setOnClickListener(this);
        tinhyeu.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.nammoi: {
                DatabaseReference ref = database.getReference("chucmungnammoi").child("SMStext");
                for (int i = 0; i < nammoils.size(); i++) {
                    ref.child(i + "").setValue(nammoils.get(i));
                }
             //   Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.noel: {
                DatabaseReference ref=database.getReference("chucmungnoel").child("SMStext");
                for (int i = 0; i < noells.size(); i++) {
                    ref.child(i + "").setValue(noells.get(i));
                }
                Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.phunu: {

                break;
            }
            case R.id.sinhnhat: {
                break;
            }
            case R.id.tinhyeu: {
                DatabaseReference ref=database.getReference("chucmungvalentine").child("SMStext");
                for (int i = 0; i < valentinels.size(); i++) {
                    ref.child(i + "").setValue(valentinels.get(i));
                }
                Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }

    public void updatanoeltext() {
        noells.add("Chúc cho Giáng Sinh này đặc biệt đến nỗi bạn sẽ không bao giờ còn cảm thấy cô đơn nữa và luôn có những người thương yêu bên cạnh");
        noells.add("Tặng bạn niềm vui để bạn ngọt ngào, tặng bạn nụ cười để bạn rạng rỡ, tặng bạn nhiều điều tốt lành để bạn mãi là người bạn thân yêu của mình!");
        noells.add("Niềm tin làm mọi thứ trở nên khả thi; Hi vọng làm mọi thứ hoạt động và Tình yêu làm mọi thứ đẹp đẽ. Chúc bạn có cả 3 điều ấy trong mùa Giáng Sinh này.");
        noells.add("Cầu chúc bạn một Giáng sinh tràn đầy những khoảnh khắc đặc biệt, bình yên, hạnh phúc, vui vẻ bên người thân. Chúc bạn một mùa Giáng sinh vui và một năm hạnh phúc.");
        noells.add("Chúc cho ngày Giáng sinh tràn đầy niềm vui; " +
                "hạnh phúc vừa đủ và bình yên thật nhiều! Không chỉ là nụ cười mà đôi khi những giọt nước mắt cũng là niềm hạnh phúc; " +
                "không có tình yêu nào là vĩnh cửu, chỉ có những giây phút vĩnh cửu của tình yêu. " +
                "Chúc cho ai đó sẽ giữ được những giây phút ấy suốt cả cuộc đời! Merry Xmas!");
        noells.add("Ai đang đọc tin nhắn này là những người rất đặc biệt trong trái tim tôi! Vì thế, hãy tự hào rằng, mỗi sáng, khi bạn thức dậy, vẫn có tôi đang nghĩ đến bạn. Tự tin với chính mình rằng dù bạn ko cao thì vẫn có tôi đang ngước nhìn bạn! Bạn ơi, tôi đủ tự tin để nói cho bạn biết bạn quan trọng và hoàn hảo trong mắt tôi thế nào! !!!! Chúc bạn một mùa Noel vui vẻ và ấm áp^^!\n");
        noells.add("Khi bạn nhận được tin nhắn này thì hãy cười đi nhé, vì ít nhất đâu đó quanh đây có một người mong bạn hạnh phúc, vui vẻ và luôn yêu đời. Khi đọc xong thì đừng ngại ngần mà gửi nó đi, nếu không gửi thì chẳng có điều gì tồi tệ xảy đến với bạn cả nhưng nếu bạn gửi thì sẽ có ai đó ở một đâu đó mỉm cười với bạn. Và đó mới là điều quan trọng….Và bây giờ, bạn cười trông đáng iu hơn đấy, đừng chọn vẻ bề ngoài, vì nó là giả dối ; đừng chọn vật chất vì nó có thể mất đi; hãy chọn nụ cười nha bạn của tôi ^^ Mùa đông ấm áp hơn khi có một nụ cười. Merry Xmas ^^!");
        noells.add("Bạn có biết mối quan hệ giữa đôi mắt không? Chúng nhấp nháy cùng nhau, chúng di chuyển cùng nhau, chúng khóc cùng nhau, chúng cùng nhìn mọi thứ và chúng ngủ với nhau – Nhưng chúng không bao giờ nhìn thấy nhau. Đó gọi là Tình bạn. Khát vọng của bạn chính là động cơ, động cơ của bạn chính là lòng tin, lòng tin của bạn chính là sự yên vui, sự yên vui đó là cái đích của bạn, cái đích đó là thiên đường của bạn. Sống hết lòng vì bạn bè. “Tuần lễ những người bạn”. Gửi đến tất cả những người bạn của tôi.Chúc bạn đón nhận tháng Giáng sinh an lành và một năm mới hạnh phúc!");
        noells.add("Giáng Sinh đến rùi ! có lẽ ai cũng có những ước nguyện riêng nhưng chắc chắn những lời chúc sẽ đem lại cho mọi người niềm tin , tình yêu và cả niềm hạnh phúc trong cuộc sống . Tôi chúc mọi người được vui vẻ bên cạnh những người thân yêu nhất của mình , ai có những chuyện buồn thì hãy gạt đi vì giáng sinh là khoảng thời gian của những ước mơ của niềm tin vào cuộc sống . Chúc mọi người có một Giáng Sinh thật hạnh phúc an lành . Nào mọi người cùng nói : ” MERRY CHRISTMAS “…..");
        noells.add("Mùa đông lạnh nhưng rất lãng mạn, nắng của mùa đông yếu nhưng đủ làm ấm trái tim một ai đó. Noel là dịp bạn và những người xung quanh tận hưởng những giây phút ngọt ngào của tình yêu thương. Đừng đóng chặt trái tim mình, hãy mở cửa trái tim để biết rằng giữa mùa đông mình vẫn thấy ấm áp. Chúc các bạn của tôi một mùa giáng sinh vui vẻ");
        noells.add("Khi bạn nhận được tin nhắn này thì hãy cười đi nhé, vì ít nhất đâu đó quanh đây có một người mong bạn hạnh phúc, vui vẻ và luôn yêu đời. Khi đọc xong thì đừng ngại ngần mà gửi nó đi, nếu không gửi thì chẳng có điều gì tồi tệ xảy đến với bạn cả nhưng nếu bạn gửi thì sẽ có ai đó ở một đâu đó mỉm cười với bạn. Và đó mới là điều quan trọng….Và bây giờ, bạn cười trông đáng iu hơn đấy, đừng chọn vẻ bề ngoài, vì nó là giả dối ; đừng chọn vật chất vì nó có thể mất đi; hãy chọn nụ cười nha bạn của tôi ^^ Mùa đông ấm áp hơn khi có một nụ cười. Merry Xmas ^_^");

        noells.add("Khi bạn nhận được lời chúc này thì hãy cười đi nhé, vì ít nhất đâu đó quanh đây có một người mong bạn Giáng sinh hạnh phúc, vui vẻ và luôn yêu đời. Khi đọc xong thì đừng ngại ngần mà gửi nó đi, nếu không gửi thì chẳng có điều gì tồi tệ xảy đến với bạn cả nhưng nếu bạn gửi thì sẽ có ai đó ở một đâu đó mỉm cười với bạn. Và đó mới là điều quan trọng… Merry Xmas!");
        noells.add("Mùa đông lạnh nhưng rất lãng mạn, nắng của mùa đông yếu nhưng đủ làm ấm trái tim một ai đó. Noel là dịp bạn và những người xung quanh tận hưởng những giây phút ngọt ngào của tình yêu thương. Đừng đóng chặt trái tim mình, hãy mở cửa trái tim để biết rằng giữa mùa đông mình vẫn thấy ấm áp. Chúc các bạn của tôi một mùa giáng sinh vui vẻ.");
        noells.add("Hạnh phúc không phải là bạn được tặng một cây thông to lớn trước nhà, được đi ăn ở những nơi sang trọng, tặng nhau những món quà đắt giá. Hạnh phúc là khi bạn thấy ấm áp trong cái lạnh của đêm Giáng Sinh, hơi ấm từ bạn bè và người thân mà họ dành tặng cho bạn trong một tấm thiệp, một lời chúc dí dỏm, một buổi đi chơi giản dị nhưng đầy ắp tình cảm. Trong không khí rộn rã của Noel năm nay, chúc mọi người một mùa Giáng Sinh thật an lành và hạnh phúc.");
        noells.add("Mot mua giang sinh nua lai ve, giang sinh 2016 that am ap. Chúc cho ai đó được hạnh phúc bên nửa yêu thương! Chúc cho ai đó còn cô đơn sẽ tìm thấy một bờ vai chia sẽ! Chúc cho ai đó sẽ tìm lại được nhau sau những tháng ngày xa cách!");
        noells.add("Chúc cho ngày Giáng sinh tràn đầy niềm vui; hạnh phúc vừa đủ và bình yên thật nhiều! Không chỉ là nụ cười mà đôi khi những giọt nước mắt cũng là niềm hạnh phúc; không có tình yêu nào là vĩnh cửu, chỉ có những giây phút vĩnh cửu của tình yêu. Chúc cho ai đó sẽ giữ được những giây phút ấy suốt cả cuộc đời! Merry Xmas!");
        noells.add("Chúc bố mẹ Giáng sinh vui vẻ, ấm áp và năm mới bình an. Không điều gì bằng gia đình mình quây quần ấm áp trong ngày lễ như thế này bố mẹ nhỉ.");
        noells.add("Con xin gửi lời chúc Noel ấm áp yêu thương tới cha mẹ. Con yêu cha mẹ và mọi người, chúc gia đình mình luôn vui vẻ, an lành.");
        noells.add("Chúc Giáng sinh an lành bố mẹ yêu mến của con. Tuy ở xa nhà không về được nhưng con luôn nhớ và yêu thương bố mẹ. Mong cho bố mẹ luôn được vui vẻ và hạnh phúc.");
        noells.add("Mùa Giáng Sinh là mùa giá rét. Nhưng khi có anh cầm tay em, mùa giá rét trở thành mùa nồng ấm. Em mong tình yêu của chúng mình sẽ mãi là ngọn lửa xua tan lạnh giá của mùa đông.");
        noells.add("Nếu ông già Noel có thật - như truyền thuyết vẫn nói và những nguyện cầu đêm Giáng Sinh đều thành hiện thực, thì ước gì em được là hơi ấm bao quanh anh giữa mùa đông lạnh giá... Là luồng khí mát ôm lấy anh giữa mùa hè rực nắng... Là làn gió nhẹ vờn tóc anh giữa mùa thu dịu dàng... Là cơn mưa bụi khẽ hôn lên má anh mỗi khi xuân về... Bởi điều em mong muốn nhất là anh được hạnh phúc, bình yên.");
        noells.add("Em thích những điều giản dị. Lời chúc cho nhau cũng vậy. Mùa Giáng Sinh, em thường chúc tất cả bằng câu: “Noel an lành nhé”. Em nghĩ vậy là đủ rồi. Còn với riêng anh, em mong anh sẽ thấy sự an lành từ tình yêu mà em đã dành cho anh.");
        noells.add("Anh đã mong rằng Giáng sinh này chúng ta được ở bên nhau nhưng rất tiếc nó lại không thành sự thực. Xin lỗi vì đã không thể cùng em đi chơi vào Noel này, chúc em Giáng sinh an lành, hạnh phúc. Luôn yêu em và sẽ đền bù khi chúng ta gặp nhau.");

    }
    public void updatavalentinetext(){
        valentinels.add("Ngốc à! Thế là một Valentin nữa lại đến rồi. Tình yêu đã trải qua rất nhiều thử thách để được hạnh phúc như ngày hôm nay. Anh rất hạnh phúc khi được ở bên Em, lo lắng - yêu thương Em.");
        valentinels.add("Valentine anh không còn cô đơn nữa, vì đã có em. Cảm ơn em! Người mang cho anh niềm vui trong cuộc sống và hứng khởi trong công việc. Năm mới chúc em luôn xinh tươi, yêu đời, thành công trong cuộc sống. Anh sẽ luôn bên em!");
        valentinels.add(" Nhân ngày Lễ tình yêu, Anh muốn nói với Em rằng: Anh mãi bên Em và ngày càng yêu Em nhiều hơn. Hãy tin ở Anh, Em nhé!");
        valentinels.add("Thời gian có thể trôi đi, nhưng tình yêu anh dành cho em là không gì thay đổi được.Trời đã lạnh hơn nhiều, em hãy ăn nhiều vào, mặc thật ấm khi ra đường và đi lại cẩn thận em nhé. Hãy tin rằng, ở đâu đó vẫn có một người vẫn chờ đợi em. Hãy cho anh thêm thời gian và cơ hội. Chúc em mọi điều tốt lành!");
        valentinels.add("Nếu ai đó hỏi anh cuộc sống tươi đẹp nghĩa là gì. Anh sẽ dựa vào vai em, ôm em thật chặt và nói: Như thế này đó!”");
        valentinels.add("Từ ngày gặp em lần đầu tiên anh đã biết thế nào gọi là T/Y. Thứ mà cả những người tiến sĩ giáo sư cũng không giãi thích được, và cũng từ lúc ấy mỗi ngày khi gặp em anh sẽ xếp 1 trái tim bằng giấy, và đến ngày thứ 30 anh sẽ cầm hộp trái tim ấy trao cho em.");
        valentinels.add("Anh sẽ cho em mượn bờ vai anh khi em muốn khóc, mượn tai anh khi em muốn tâm sự, mượn tay anh để em xiết chặt, mượn đôi chân anh để đi cùng em, nhưng anh không thể cho em mượn trái tim anh được vì nó đã thuộc về em rồi mà.");
        valentinels.add("Lần đầu tiên em nhìn thấy anh..em đã thấy tình yêu…\n" +
                "Lần đầu tiên anh chạm vào em…em đã cảm nhận được tình yêu.\n" +
                "Và sau những khoảng thời gian đó…Anh vẫn là người duy nhất em yêu.\n");
        valentinels.add("Anh có thể nói anh yêu em ngàn lần hơn thế nhưng vẫn không đủ để diễn đạt hết trọn vẹn tình cảm anh dành cho em. Tuy thế nhưng anh sẽ vẫn cố gắng trút trọn tình cảm của mình để nói anh yêu em");
        valentinels.add("Gặp em là khoảnh khắc kỳ diệu nhất trong cuộc đời của anh. Hẹn hò với em là quyết định đúng đắn nhất trong cuộc đời của anh. Và có được em trong cuộc đời của anh là điều tuyệt vời nhất đã từng xảy ra đối với anh. Anh yêu em");
        valentinels.add("Người bạn gái tuyệt vời nhất trên thế giới xứng đáng được có người bạn trai tuyệt vời nhất trên thế giới. Dễ yêu quá đi thôi, chúng ta được sinh ra là để dành cho nhau mà, em nhỉ! Anh yêu em");
        valentinels.add("Cứ khi nào anh nhắm mắt lại là anh liền nhớ tới em, anh có thể cảm nhận được cơn gió mùa Hè mạnh mẽ nhưng ấm áp lạ. Điều đó bởi vì em chính là ánh sáng mặt trời của anh. Anh yêu em, cưng à");
        valentinels.add("Em có biết là em rất đặc biệt đối với anh không. Và em ngày càng trở nên quan trọng đối với anh hơn. Anh thấy nhớ em khi em không có ở đây bên anh. Anh nhớ những khoảnh khắc chúng ta ở bên nhau. Anh nghĩ rằng anh đã yêu em mất rồi");
        valentinels.add("Em là người con gái ngọt ngào nhất, dễ thương nhất, xinh đẹp nhất và nóng bỏng nhất của anh đó. Anh thật sự là không tưởng khi có được người phụ nữ đẹp như em, và anh đã phải nhéo mình mỗi ngày để kiểm tra xem là anh có đang mơ không. Anh yêu em");
        valentinels.add("Em không phải là một phần cuộc sống của anh, cưng à, mà em là tất cả cuộc sống của anh đó. Anh yêu em");
        valentinels.add("Anh muốn đối xử với em như một nữ hoàng bởi vì em thống trị thế giới của anh. Anh sẵn sàng phục vụ em, tô điểm thêm cho sự uy nghi của em. Anh yêu em");
    }
}
