# 🏦 Turkcell Banking System v3.0
> N-Tier Architecture ile güçlendirilmiş, Java tabanlı modern bankacılık simülasyonu.

---

## 🌟 Öne Çıkan Özellikler
| Özellik | Açıklama | Durum |
| :--- | :--- | :---: |
| **Müşteri Yönetimi** | TC bazlı benzersiz kayıt sistemi | ✅ |
| **Transfer Modülü** | Hesaplar arası anlık para gönderimi | ✅ |
| **İşlem Geçmişi** | Tüm hareketlerin detaylı loglanması | ✅ |
| **Limit Kontrolü** | Yetersiz bakiye ve bakiye koruması | ✅ |

---

## 🏗️ Mimari Yapı (Layers)
Proje, sürdürülebilir kod prensiplerine uygun olarak **4 katmanlı** tasarlanmıştır:

* 📂 **Model:** Veri nesneleri (`Account`, `Customer`, `Transaction`).
* 📂 **Repository:** Geçici veri deposu ve liste yönetimi.
* 📂 **Service:** İş kuralları ve validasyon mantığı.
* 📂 **Main:** Kullanıcı dostu `Scanner` arayüzü.

---

## 🚀 Nasıl Çalıştırılır?
1. Bu depoyu klonlayın: `git clone https://github.com/nisasubozkurt/turkcell-banking-application.git`
2. IDE'niz ile projeyi açın.
3. `com.turkcell.banking.Main` sınıfını sağ tıklayıp **Run** deyin.
4. Konsol üzerinden Nisasu ve Halit örnekleriyle test etmeye başlayın!

---

## 🛠️ Kullanılan Teknolojiler
* **Dil:** Java 17+
* **Build Tool:** Maven
* **Versiyon Kontrol:** Git & GitHub

---

### 🤝 İletişim
**Nisasu Bozkurt** - [LinkedIn](https://www.linkedin.com/in/nisasubozkurt/) - Software Engineer & AI Developer
