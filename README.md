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

---
### EK BİLGİ EDİNMEK İSTEYENLER İÇİN:

# 🌐 HTTP İsteğinin Anatomisi

## 🚀 Giriş

Tarayıcıya bir URL yazıp Enter’a bastığında, arka planda istemci (client) ve sunucu (server) arasında bir iletişim başlar.  
Bu iletişim, internetin temel protokolü olan **HTTP (HyperText Transfer Protocol)** ile gerçekleşir.

Bir web sitesinin açılması, API’den veri çekilmesi veya bir formun gönderilmesi gibi işlemlerin tamamı HTTP istekleri sayesinde olur.

---

## 🔄 İstek – Cevap Döngüsü

HTTP iletişimi iki taraf arasında gerçekleşir:

- **Client (İstemci)** → Tarayıcı, mobil uygulama vb.
- **Server (Sunucu)** → Web sunucusu

<img width="853" height="359" alt="1*MoxFEabKGx6NxlKoZ0lXJQ" src="https://github.com/user-attachments/assets/68eb2cb9-13df-4bba-a4db-edf387928bae" />

```
Client → HTTP Request → Server  
Server → HTTP Response → Client
```

---

## 🖼️ HTTP Akış Diyagramı

<img width="1938" height="1116" alt="7140c6e1-4315-45cf-8648-d7685219bc6b_1938x1116" src="https://github.com/user-attachments/assets/4cac4c69-1f4c-4f93-8803-34038e82b94b" />

---

## 🧩 HTTP İsteğinin Yapısı

Bir HTTP isteği 3 ana bölümden oluşur:

1. **Request Line (İstek Satırı)**  
2. **Headers (Başlıklar)**  
3. **Body (Gövde - opsiyonel)**  

<img width="656" height="221" alt="public" src="https://github.com/user-attachments/assets/3db0edfb-50b8-4015-a1f3-b9fa26732c8f" />

---

## 1️⃣ Request Line (İstek Satırı)

```
GET /index.html HTTP/1.1
```

Bu satır üç önemli parçadan oluşur:

- **Method** → Yapılacak işlem (GET, POST vb.)
- **Path** → İstenen kaynağın yolu
- **HTTP Version** → Kullanılan protokol versiyonu

---

## 2️⃣ HTTP Metotları

- **GET** → Veri almak  
- **POST** → Veri göndermek  
- **PUT** → Veri güncellemek  
- **DELETE** → Veri silmek  

![http-request-methods png](https://github.com/user-attachments/assets/c7b57de4-2056-4621-be4b-fdcb5f00fe9e)

---

## 3️⃣ URL Yapısı

```
https://www.site.com/api/users?id=5
```

- **Protocol** → https  
- **Domain** → www.site.com  
- **Path** → /api/users  
- **Query** → ?id=5  

![url-anatomisi-1024x538](https://github.com/user-attachments/assets/584f2a4d-29e2-42e9-8245-6069c96a1463)

---

## 4️⃣ Headers (Başlıklar)

```<img width="851" height="279" alt="1*Os45ztb1TEtRNNQC82Fzzg" src="https://github.com/user-attachments/assets/f34438b6-803e-4cb2-b7d1-94ec6dbfb552" />

Host: www.example.com
User-Agent: Mozilla/5.0
Accept: application/json
Authorization: Bearer token
```

Header’lar, sunucuya istek hakkında ek bilgiler gönderir.

![6720dff9eada99162c95b2dc_6720d2b615942a4c363974ed_3%20-%2029 10-min](https://github.com/user-attachments/assets/c68ae7e6-0de0-4d28-a863-b7482e319e98)

---

## 5️⃣ Body (Gövde)

Özellikle POST ve PUT isteklerinde veri taşır:

```json
{
  "username": "nisasu",
  "password": "123456"
}
```

GET isteklerinde genellikle body bulunmaz.

---

## 🧱 HTTP İstek Örneği

```
POST /login HTTP/1.1
Host: example.com
Content-Type: application/json
Content-Length: 50

{
  "username": "nisasu",
  "password": "123456"
}
```

<img width="851" height="279" alt="1*Os45ztb1TEtRNNQC82Fzzg" src="https://github.com/user-attachments/assets/b4044f2c-3940-41c2-a75a-69b6b4ab3858" />


📌 Not: Header ile Body arasında boş satır bulunur.

---

## 🔐 HTTP vs HTTPS

| Özellik | HTTP | HTTPS |
|--------|------|-------|
| Güvenlik | Yok | Var |
| Şifreleme | Yok | SSL/TLS |
| Kullanım | Eski | Modern |

![Difference-Between-HTTP-and-HTTPS png](https://github.com/user-attachments/assets/089db39d-8947-4c2b-b8b9-d016789a1a13)

---

## ⚙️ HTTP Özellikleri

- **Stateless** → Her istek bağımsızdır  
- **Request-Response Modeli** → İstemci ister, sunucu cevap verir  
- **Metin tabanlıdır (HTTP/1.1)**  

---

## 🧠 Neden Önemli?

HTTP isteğini anlamak:

- Web geliştirme  
- API kullanımı  
- Backend geliştirme  
- Debug işlemleri  

için kritik öneme sahiptir.

---

## 🎯 Sonuç

HTTP, internetin temel iletişim mekanizmasıdır.

Bir HTTP isteği:
- Ne yapılacağını (Method)
- Nereye yapılacağını (URL)
- Nasıl yapılacağını (Headers + Body)

belirler.

Bu yapıyı anlamak, modern web teknolojilerini anlamanın ilk adımıdır.

