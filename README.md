# 🖥️ TestNG Practice
<br><br>
**TestNG Practice** projesi, TestNG framework'ü kullanılarak test otomasyonu süreçlerini öğrenmek ve geliştirmek için hazırlanmıştır.  
Bu proje, temel ve ileri seviye TestNG özelliklerini uygulamak ve test senaryolarını yönetmek için kullanılabilir.  
<br><br>

## ✨ Proje Özellikleri
<br><br>
- **TestNG Anotasyonları**: `@Test`, `@BeforeMethod`, `@AfterMethod`, `@DataProvider` gibi anotasyonların kullanımı.  
- **Parametreli Testler**: Farklı veri kümeleriyle testlerin çalıştırılması.  
- **Test Prioritization**: Testlerin öncelik sırasına göre çalıştırılması.  
- **Assertions**: Test sonuçlarının doğrulanması için çeşitli assertion türleri.  
- **Raporlama**: TestNG'nin dahili raporlama özelliği ile sonuçların görselleştirilmesi.  
<br><br>

## 📐 Kullanılan Teknolojiler ve Bağımlılıklar
<br><br>
Bu projede aşağıdaki teknolojiler kullanılmıştır:<br><br>

- **TestNG**: Java tabanlı test otomasyonu framework'ü.  
- **Selenium WebDriver**: UI test otomasyonu.  
- **Maven**: Proje yönetimi ve bağımlılık yönetimi.  
<br><br>

## 🔧 Kurulum ve Çalıştırma
<br><br>
Projeyi yerel bilgisayarınıza klonlayın:  
`git clone https://github.com/seflekL/testNG_Practice.git`  
<br><br>
Proje dizinine gidin:  
`cd testNG_Practice`  
<br><br>
Maven bağımlılıklarını yükleyin:  
`mvn clean install`  
<br><br>
Testleri çalıştırın:  
`mvn test`  
<br><br>

## 📊 Örnek Test Senaryoları
<br><br>
### Basit Test
Aşağıdaki örnek, temel bir TestNG test senaryosunu göstermektedir:<br><br>

```java
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void testAddition() {
        int a = 5;
        int b = 10;
        int result = a + b;
        Assert.assertEquals(result, 15, "Toplama işlemi başarısız!");
    }
}
Parametreli Test
Bu örnek, @DataProvider kullanarak farklı veri kümeleriyle test çalıştırmayı göstermektedir:<br><br>
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizedTest {
    @DataProvider(name = "numbers")
    public Object[][] provideNumbers() {
        return new Object[][]{{1, 2, 3}, {4, 5, 9}, {3, 3, 6}};
    }

    @Test(dataProvider = "numbers")
    public void testAddition(int a, int b, int expected) {
        int result = a + b;
        Assert.assertEquals(result, expected, "Toplama işlemi başarısız!");
    }
}

📫 İletişim
GitHub: seflekL
