package com.example.speakingjoy.bilmedikleriniz;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        final String[] bilmedikleriniz={"","Dağ sıçanları hıyarcıklı veba hastalığına karşı hassastırlar ve bu hastağılı öksürerek etraflarına yayarlar. Pirelere, sıçanlara ve en ninayetinde de insanlara bulaştırırlar. Dağ sıçanlarından ölen insanların sayısı tahmini 1 milyardır. En tehlikeli ikinci hayvandır.",
                "Şu ana kadar ölmüş olan insanların yarısını (muhtemelen 45 milyar kişi) dişi sivrisinekler öldürmüştür. Erkek sivrisinekler sadece ısırır.\n" +
                        "Sivrisinekler potansiyel olarak ölümcül olan 100'den fazla hastalık taşır: Sıtma, sarı humma, dang humması, ansefalit, filarya enfestasyonu ve fil hastalığı gibi... Sivrisinekler günümüzde bile her 12 asniyede bir kişiyi öldürüyorlar..",
                "Çalışmak, içki uyuşturucu ya da savaştan çok daha fazla insan öldürmektedir.\n" +
                        "\n" +
                "Her yıl yaklaşık iki milyon insan işle ilgili kazalar ya da hastalıklar yüzünden ölüyor. Buna karşılık savaşlarda her yıl 650 bin kişi ölüyor.",
                "Alışıldık cevap suyun rengi olmadığıdır. Su şeffaf ya da saydamdır.\n" +
                        "\n" +
                        "Yanlış. Su aslında mavidir. Son derece soluk olsa da yine de mavidir. Donmuş bir şelalelin kalın buzlarının içine baktığınızda yada büyük ve beyaz bir havuza su doldurduğunuzda suyun mavi olduğunu göreceksiniz..",
                "Edison 3 ila 6 metre uzaktan duyulabileceği için telefon görüşmelerine Alo diyerek başlamak gerektiğini söylemiştir. Edison bunu Graham Bell'in ilk telefonunu test ederken keşfetmiştir. Beli ise denizcilerin kullandığı \"ahoy, hoy, hey, ho\" gibi ünlemleri tercih ediyordu.",
                "Ay'da yalnızca 12 kişi yürüdü; bunların hepsi de Amerikalıydı. Astronotlar Ay'daki toprağın kara benzediğini, barut gibi koktuğunu ve tadının çok kötü olmadığını söylediler. Bu toprak büyük ölçüde Ay'ın yüzeyine çarpan göstaşlarının yol açtığı silikon dioksitten meydana gelmektedir. Bunun yanı sıra demir, kalsiyum ve magnezyum gibi mineraller içerir.\n",
                "Çok basit, üç: Katı, sıvı, gaz' diyenler yanıldı.. Çünkü maddenin tam 15 tane hali vardır:\n" +
                        "\n" +
                        "Katı, amorf katı, sıvı, gaz, plazma, süper akışkan, süper katı, dejenere katı, nötrünoyum, güçlü simetrik madde, zayıf simetrik madde, kuarkgluon plazma, fermiyonik yoğunlaştırma, Bose-Einstein yoğunlaştırması, acayip madde..\n",
                "İnsan kalbi yerinden çıkarıldığında bir süre daha atmaya ve etrafındaki havadan oksijen almaya devam eder çünkü kendi elektrik sistemine sahiptir",
                "Mide asidi o kadar güçlüdür ki vücudunuz her 3-4 günde bir midenizin iç katmanını baştan aşağı yeniler",
                "İnsan burnu 50.000 kokuyu tanır ve hatırlar, neredeyse köpek burnu kadar güçlüdür",
                " Vücudunuzda 96.000 km uzunluğunda kan damarı vardır. Bu uzunluk Ekvator'un çevresinde 2.5 tur atabilir",
                "Kalbiniz her gün bir kamyonu 32 km götürmeye yetecek enerji üretir. Ömür boyunca ürettiği enerji ile bir kamyon aya gidip geri dönebilir",
                "70 yıllık ömrü boyunca bir insan kendinden ortalama 48 kilo deri döker",
                " Havanın açık olduğu bir gece gökyüzüne bakarsanız Andromeda galaksisini görebilirsiniz, bu gözlerinizin küçücük bir ışık huzmesini yakalayabilecek kadar hassas ve güçlü olduğu anlamına gelir zira bu komşu galaksi 2,5 milyon ışık yılı uzaklıktadır",
                "80 desibel gücünde horlamak mümkündür. Bu seviye bir beton kırıcı hava tabancasının yanında uyumak ile eşdeğerdir. 85 desibelin üzerindeki gürültü seviyeleri insan kulağı için zararlı kabul edilmektedir",
                " Bir insan ömrü boyunca 25.000 metreküp hacminde iki yüzme havuzunu dolduracak kadar tükürük üretir",
                "Uyanık olduğunda beyniniz bir ampulü yakmaya yetecek kadar elektrik üretir",
                "Kemikleriniz aynı ebattaki çelikten daha güçlüdür, buna karşın çelikten 4-5 kat daha hafiftir ve çelikten bile güçlü olan kemiklerinizin %31'i sudur",
                " İnsan gözü dijital bir kamera olsaydı, 576 megapiksel olurdu. Piyasada bulabileceğiniz en gelişmiş 80 megapiksel DSLR'nin fiyatı 34.000 dolardır. Ayrıca uzmanlar insan gözünün 10 milyon farklı rengi ayırt edebildiğini tahmin etmektedir",
                "Kılıf içerisinde olmasaydı tüm hücrelerinizde yer alan DNA dünyadan Plüton'a gidip geri gelecek kadar esneyebilirdi",
                "Ömrünüz boyunca, beyninizin uzun dönem hafızası 1 kuadrilyon (1 milyon x milyar) ayrı bit bilgiyi tutabilir",
                "Ortalama bir insan ömründe, kalp yaklaşık olarak 1.5 milyon varil - 200 tankeri doldurmaya yerecek kadar - kan pompalar",
                "Vücudunuz saatte 180 milyon kırmızı kan hücresi üretir",
                " Hamilelik süresince, eğer annede organ hasarı ortaya çıkarsa, rahimdeki bebek hasarlı organı onarmak için kök hücre gönderir",
                " Bir adım atmak için 200 kas çalışır",
                " Tek bir hücrede 6 milyar DNA bulunur",
                "Bir insan hiç yemek yemeden 2 ay yaşayabilir",
                "Tat alma reseptörleri sadece dilinizde bulunmaz, aynı zamanda midenizde, ince bağırsağınızda, pankreasınızda, akciğerinizde, anüste, testislerde ve beyinde de tat alma reseptörleri bulunur",
                "Hafızanıza yeni bir şey kaydettiğinizde beyindeki nöronlar arasında yeni bir fiziki bağ oluşturulur. Her yeni kayıt ile beyninizde fiziki bir değişim yaşanır",
                "Beyin hücreleriniz ölmeye başlamadan önce oksijensiz 5-10 dakika hayatta kalabilirsiniz",
                "Beyninizin %60'ı yağdan oluşur",
                "Uzun süreli açlık durumunda insan beyni son bir kurtuluş çaresi olarak kendi kendini yiyecektir",
                "Fobiler kalıtımsal olabilir",
                "Belli uyaranlara karşı önceden otomatik olarak programlanmış şekilde vermiş olduğunuz tepkilere duygu denir. Yüzünüzü bir duyguyu yansıtacak şekilde değiştirdiğiniz zaman o duyguyu yaşamaya başlarsınız",
                "insan gözü her defasında yalnızca görüş alanınızdaki küçük bir alanı görebilir, bunları tek bir resim haline geiterbilmek için saniyede 2-3 seğirme (hızlı, otomatik göz hareketi) gerçekleştirir",
                "Beyniniz kendisini aşırı yüklenmeden ve duygusal çöküntülerden korumak için bildiklerini unutur, bu yeni bilgileri daha kolay ve hızlı öğrenmenizde size yardımcı olur",
                "Profesör Clarence Leuba kendi çocuklarını gözlemleyerek gıdıklandığımızda gülmenin doğuştan olup olmadığını öğrenmeye çalıştı. 1933’te ilk çocuğunu gıdıklarken yüzünü maske ile kapatarak yüz ifadesinin görünmesini engelledi. İlk çocuğuyla yaptığı deney bozulunca deneye ikinci çocuğuyla devam etti ve kızını gıdıklarken kendisinin o güne kadar hiç gülmemesine rağmen kızının güldüğünü gördü. ",
                "Su samurları el ele tutuşarak uyuyorlar.",
                "Leonardo Da Vinci aynı anda bir eliyle yazı yazıp diğer eliyle resim yapabiliyordu.",
                "Taklitçi ahtapot isimli ahtapot, sadece renk değiştirmekle kalmıyor, aynı zamanda dil balığı, aslan balığı ve deniz yılanı gibi hayvanların şekline de bürünebiliyor.",
                "Dünyada yaşayan tüm insanları oluşturan atomlardaki boşluklar çıkarılırsa tüm dünya nüfusu bir elmaya sığabilir.",
                "1960'larda CIA, Rus konsolosluklarında casusluk için, Akustik Kedicik ismini verdiği programında, cerrahi yöntemle kedilerin içine mikrofon, pil ve anten yerleştirerek kedileri dinleme cihazına dönüştürdü.",
                "Dünyanın en zengin 3 ailesi, en fakir 48 ülkenin toplam servetinden daha fazla servete sahip.",
                "Dünyanın en uzun süren trafik sıkışıklığı 12 gün sürdü, 100 km kuyruk oluştu ve araçlar günde 1 kilometre ilerleyebildiler.",
                "Everest Dağı'nda 200'den fazla dağcı cesedi bulunmakta.",
                "Pulp Fiction filminde tüm saatler 04.20'yi gösterir.",
                "Bir erkek aslan yönetimi ele geçirince tüm yavru aslanları infaz eder.",
                "Dünyadaki insanların üçte ikisi hiç kar görmedi.",
                "Artık nesli tükenmiş olan 'Yünlü mamut' isimli mamut türünün canlıları Mısır Piramitleri inşa edilirken varlardı.",
                "Ortalama bir insan, ömrü boyunca dünyanın çevresini yaklaşık üç defa dolaşacak kadar yürür.",
                "Bir denizanasının %95'i sudan oluşmaktadır.",
                "Charles Osborne isimli bir adamın hıçkırığı 69 yıl sürdü.",
                "Varyemez Amca isimli çizgi film, külot giymiyor olması gerekçesiyle Finlandiya'da yasaklanmıştır.",
                "Çok sert hapşırırsanız kaburga kemiklerinizden biri kırılabilir.",
                "Geceleri sabaha göre 1 cm daha kısa olursunuz.",
                "İneklerin en iyi arkadaşları vardır ve onlardan uzaklaştırıldıklarında stres yaşarlar.",
                "Karda gizlenmeye çalışan bir kutup ayısı, siyah burnunu pençesiyle kapatır.",
                "Sivrisineklerin 47 tane dişi vardır.",
                "Klinik ölüm sonrası insan 5 dakika içinde hayata geri getirilebilir. 5 dakika sonra beyin hücreleri ölmeye başlar, ama yine de bu süreyi 5 dakika daha uzatmak mümkündür."};
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            for(int i=0;i<bilmedikleriniz.length;i++) {
                if (getArguments().getInt(ARG_SECTION_NUMBER) == i) {
                textView.setText(bilmedikleriniz[i]);
            }
            }
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */

    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        final String[] bilmedikleriniz={"","Dağ sıçanları hıyarcıklı veba hastalığına karşı hassastırlar ve bu hastağılı öksürerek etraflarına yayarlar. Pirelere, sıçanlara ve en ninayetinde de insanlara bulaştırırlar. Dağ sıçanlarından ölen insanların sayısı tahmini 1 milyardır. En tehlikeli ikinci hayvandır.",
                "Şu ana kadar ölmüş olan insanların yarısını (muhtemelen 45 milyar kişi) dişi sivrisinekler öldürmüştür. Erkek sivrisinekler sadece ısırır.\n" +
                        "Sivrisinekler potansiyel olarak ölümcül olan 100'den fazla hastalık taşır: Sıtma, sarı humma, dang humması, ansefalit, filarya enfestasyonu ve fil hastalığı gibi... Sivrisinekler günümüzde bile her 12 asniyede bir kişiyi öldürüyorlar..",
                "Çalışmak, içki uyuşturucu ya da savaştan çok daha fazla insan öldürmektedir.\n" +
                        "\n" +
                        "Her yıl yaklaşık iki milyon insan işle ilgili kazalar ya da hastalıklar yüzünden ölüyor. Buna karşılık savaşlarda her yıl 650 bin kişi ölüyor.",
                "Alışıldık cevap suyun rengi olmadığıdır. Su şeffaf ya da saydamdır.\n" +
                        "\n" +
                        "Yanlış. Su aslında mavidir. Son derece soluk olsa da yine de mavidir. Donmuş bir şelalelin kalın buzlarının içine baktığınızda yada büyük ve beyaz bir havuza su doldurduğunuzda suyun mavi olduğunu göreceksiniz..",
                "Edison 3 ila 6 metre uzaktan duyulabileceği için telefon görüşmelerine Alo diyerek başlamak gerektiğini söylemiştir. Edison bunu Graham Bell'in ilk telefonunu test ederken keşfetmiştir. Beli ise denizcilerin kullandığı \"ahoy, hoy, hey, ho\" gibi ünlemleri tercih ediyordu.",
                "Ay'da yalnızca 12 kişi yürüdü; bunların hepsi de Amerikalıydı. Astronotlar Ay'daki toprağın kara benzediğini, barut gibi koktuğunu ve tadının çok kötü olmadığını söylediler. Bu toprak büyük ölçüde Ay'ın yüzeyine çarpan göstaşlarının yol açtığı silikon dioksitten meydana gelmektedir. Bunun yanı sıra demir, kalsiyum ve magnezyum gibi mineraller içerir.\n",
                "Çok basit, üç: Katı, sıvı, gaz' diyenler yanıldı.. Çünkü maddenin tam 15 tane hali vardır:\n" +
                        "\n" +
                        "Katı, amorf katı, sıvı, gaz, plazma, süper akışkan, süper katı, dejenere katı, nötrünoyum, güçlü simetrik madde, zayıf simetrik madde, kuarkgluon plazma, fermiyonik yoğunlaştırma, Bose-Einstein yoğunlaştırması, acayip madde..\n",
                "İnsan kalbi yerinden çıkarıldığında bir süre daha atmaya ve etrafındaki havadan oksijen almaya devam eder çünkü kendi elektrik sistemine sahiptir",
                "Mide asidi o kadar güçlüdür ki vücudunuz her 3-4 günde bir midenizin iç katmanını baştan aşağı yeniler",
                "İnsan burnu 50.000 kokuyu tanır ve hatırlar, neredeyse köpek burnu kadar güçlüdür",
                " Vücudunuzda 96.000 km uzunluğunda kan damarı vardır. Bu uzunluk Ekvator'un çevresinde 2.5 tur atabilir",
                "Kalbiniz her gün bir kamyonu 32 km götürmeye yetecek enerji üretir. Ömür boyunca ürettiği enerji ile bir kamyon aya gidip geri dönebilir",
                "70 yıllık ömrü boyunca bir insan kendinden ortalama 48 kilo deri döker",
                " Havanın açık olduğu bir gece gökyüzüne bakarsanız Andromeda galaksisini görebilirsiniz, bu gözlerinizin küçücük bir ışık huzmesini yakalayabilecek kadar hassas ve güçlü olduğu anlamına gelir zira bu komşu galaksi 2,5 milyon ışık yılı uzaklıktadır",
                "80 desibel gücünde horlamak mümkündür. Bu seviye bir beton kırıcı hava tabancasının yanında uyumak ile eşdeğerdir. 85 desibelin üzerindeki gürültü seviyeleri insan kulağı için zararlı kabul edilmektedir",
                " Bir insan ömrü boyunca 25.000 metreküp hacminde iki yüzme havuzunu dolduracak kadar tükürük üretir",
                "Uyanık olduğunda beyniniz bir ampulü yakmaya yetecek kadar elektrik üretir",
                "Kemikleriniz aynı ebattaki çelikten daha güçlüdür, buna karşın çelikten 4-5 kat daha hafiftir ve çelikten bile güçlü olan kemiklerinizin %31'i sudur",
                " İnsan gözü dijital bir kamera olsaydı, 576 megapiksel olurdu. Piyasada bulabileceğiniz en gelişmiş 80 megapiksel DSLR'nin fiyatı 34.000 dolardır. Ayrıca uzmanlar insan gözünün 10 milyon farklı rengi ayırt edebildiğini tahmin etmektedir",
                "Kılıf içerisinde olmasaydı tüm hücrelerinizde yer alan DNA dünyadan Plüton'a gidip geri gelecek kadar esneyebilirdi",
                "Ömrünüz boyunca, beyninizin uzun dönem hafızası 1 kuadrilyon (1 milyon x milyar) ayrı bit bilgiyi tutabilir",
                "Ortalama bir insan ömründe, kalp yaklaşık olarak 1.5 milyon varil - 200 tankeri doldurmaya yerecek kadar - kan pompalar",
                "Vücudunuz saatte 180 milyon kırmızı kan hücresi üretir",
                " Hamilelik süresince, eğer annede organ hasarı ortaya çıkarsa, rahimdeki bebek hasarlı organı onarmak için kök hücre gönderir",
                " Bir adım atmak için 200 kas çalışır",
                " Tek bir hücrede 6 milyar DNA bulunur",
                "Bir insan hiç yemek yemeden 2 ay yaşayabilir",
                "Tat alma reseptörleri sadece dilinizde bulunmaz, aynı zamanda midenizde, ince bağırsağınızda, pankreasınızda, akciğerinizde, anüste, testislerde ve beyinde de tat alma reseptörleri bulunur",
                "Hafızanıza yeni bir şey kaydettiğinizde beyindeki nöronlar arasında yeni bir fiziki bağ oluşturulur. Her yeni kayıt ile beyninizde fiziki bir değişim yaşanır",
                "Beyin hücreleriniz ölmeye başlamadan önce oksijensiz 5-10 dakika hayatta kalabilirsiniz",
                "Beyninizin %60'ı yağdan oluşur",
                "Uzun süreli açlık durumunda insan beyni son bir kurtuluş çaresi olarak kendi kendini yiyecektir",
                "Fobiler kalıtımsal olabilir",
                "Belli uyaranlara karşı önceden otomatik olarak programlanmış şekilde vermiş olduğunuz tepkilere duygu denir. Yüzünüzü bir duyguyu yansıtacak şekilde değiştirdiğiniz zaman o duyguyu yaşamaya başlarsınız",
                "insan gözü her defasında yalnızca görüş alanınızdaki küçük bir alanı görebilir, bunları tek bir resim haline geiterbilmek için saniyede 2-3 seğirme (hızlı, otomatik göz hareketi) gerçekleştirir",
                "Beyniniz kendisini aşırı yüklenmeden ve duygusal çöküntülerden korumak için bildiklerini unutur, bu yeni bilgileri daha kolay ve hızlı öğrenmenizde size yardımcı olur",
                "Profesör Clarence Leuba kendi çocuklarını gözlemleyerek gıdıklandığımızda gülmenin doğuştan olup olmadığını öğrenmeye çalıştı. 1933’te ilk çocuğunu gıdıklarken yüzünü maske ile kapatarak yüz ifadesinin görünmesini engelledi. İlk çocuğuyla yaptığı deney bozulunca deneye ikinci çocuğuyla devam etti ve kızını gıdıklarken kendisinin o güne kadar hiç gülmemesine rağmen kızının güldüğünü gördü. ",
                "Su samurları el ele tutuşarak uyuyorlar.",
                "Leonardo Da Vinci aynı anda bir eliyle yazı yazıp diğer eliyle resim yapabiliyordu.",
                "Taklitçi ahtapot isimli ahtapot, sadece renk değiştirmekle kalmıyor, aynı zamanda dil balığı, aslan balığı ve deniz yılanı gibi hayvanların şekline de bürünebiliyor.",
                "Dünyada yaşayan tüm insanları oluşturan atomlardaki boşluklar çıkarılırsa tüm dünya nüfusu bir elmaya sığabilir.",
                "1960'larda CIA, Rus konsolosluklarında casusluk için, Akustik Kedicik ismini verdiği programında, cerrahi yöntemle kedilerin içine mikrofon, pil ve anten yerleştirerek kedileri dinleme cihazına dönüştürdü.",
                "Dünyanın en zengin 3 ailesi, en fakir 48 ülkenin toplam servetinden daha fazla servete sahip.",
                "Dünyanın en uzun süren trafik sıkışıklığı 12 gün sürdü, 100 km kuyruk oluştu ve araçlar günde 1 kilometre ilerleyebildiler.",
                "Everest Dağı'nda 200'den fazla dağcı cesedi bulunmakta.",
                "Pulp Fiction filminde tüm saatler 04.20'yi gösterir.",
                "Bir erkek aslan yönetimi ele geçirince tüm yavru aslanları infaz eder.",
                "Dünyadaki insanların üçte ikisi hiç kar görmedi.",
                "Artık nesli tükenmiş olan 'Yünlü mamut' isimli mamut türünün canlıları Mısır Piramitleri inşa edilirken varlardı.",
                "Ortalama bir insan, ömrü boyunca dünyanın çevresini yaklaşık üç defa dolaşacak kadar yürür.",
                "Bir denizanasının %95'i sudan oluşmaktadır.",
                "Charles Osborne isimli bir adamın hıçkırığı 69 yıl sürdü.",
                "Varyemez Amca isimli çizgi film, külot giymiyor olması gerekçesiyle Finlandiya'da yasaklanmıştır.",
                "Çok sert hapşırırsanız kaburga kemiklerinizden biri kırılabilir.",
                "Geceleri sabaha göre 1 cm daha kısa olursunuz.",
                "İneklerin en iyi arkadaşları vardır ve onlardan uzaklaştırıldıklarında stres yaşarlar.",
                "Karda gizlenmeye çalışan bir kutup ayısı, siyah burnunu pençesiyle kapatır.",
                "Sivrisineklerin 47 tane dişi vardır.",
                "Klinik ölüm sonrası insan 5 dakika içinde hayata geri getirilebilir. 5 dakika sonra beyin hücreleri ölmeye başlar, ama yine de bu süreyi 5 dakika daha uzatmak mümkündür."};

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show dizi.length
            return bilmedikleriniz.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
                case 2:
                    return "SECTION 3";
                case 3:
                    return "SECTION 4";
                case 4:
                    return "SECTION 5";
                case 5:
                    return "SECTION 6";
            }
            return null;
        }
    }
}
