package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

//calistirmak istediğim feuture file belirtiyorum
@CucumberOptions(
        features = "src/test/resources/Sprint_13.06/Eagles/Day17_C6_US100451_oda_rezervasyonu.feature",  //ZORUNLU =  Feature dosyanin pathini girmemiz lazım
        glue = "stepdefinitions",  // ZORUNLU  = Stepdefinition adresi (path) i
        tags = "@room_rezervasyonu",//hangi feature file kosmali onu belirtiyoruz. Eger Tags kullanmazsak Runner tüm featureları run eder
        dryRun = false  //opsiyoneldir
)

public class Runner {
}


/*
Runner: feature file ları calıştırmaka için kullanılır
@RunWith: Cucumber.class ları çalıştırmak için kullanılır, kullanmadan Runner calışmaz
@CucumberOptions(): feature path i eklemek için kullanılır, step definition path, tags, drRun, report plugins icerir
-feature: feature dosyası path ini veri, spesifik bir feature file isaret edilebilir.
-glue: step definition class inde spesifik path i isaret eder
-tags: hangi feature yada senaryo kosacak bunu belirler. bu tag i feature file a ekliyoruz
-dryRun: herhangi bir JAVA kod eksikliğini kontrol eder (step definition kullanırız)
        :dryRun 2 value (deger) alır, true (head-less) veya false
        :dryRun =false == herhangi bir JAVA kodunun eksik olup olmadığını kontrol ederken tarayıcıda testleri calıştırır
        :dryRun =true == herhangi bir JAVA kodunun eksik olup olmadığını kontrol ederken tarayıcı OLMADAN testleri calıştırır
*/

