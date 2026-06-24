# 🎮 MARMARA GAMES OFFICIAL ANDROID REPOSITORY

<div align="center">
  <img src="https://img.shields.io/badge/Marmara%20Games-Studio-blueviolet?style=for-the-badge&logo=unrealengine&logoColor=white" alt="Marmara Games">
  <img src="https://img.shields.io/badge/Architecture-C%2B%2B%20%2F%20Java%20NDK-orange?style=for-the-badge&logo=c%2B%2B&logoColor=white" alt="Architecture">
  <img src="https://img.shields.io/badge/AI%20Assistant-SunAI%20Entegre-brightgreen?style=for-the-badge&logo=google-assistant&logoColor=white" alt="SunAI">
  <img src="https://img.shields.io/badge/Status-Active%20Development-cyan?style=for-the-badge" alt="Status">
</div>

<br />

<div align="center">
  <a href="https://marmaragames.oneapp.dev"><img src="https://img.shields.io/badge/🌐%20Resmi%20Web%20Portalı-Ziyaret%20Et-0052FF?style=for-the-badge&logo=google-chrome&logoColor=white" /></a>
  <a href="https://github.com"><img src="https://img.shields.io/badge/🚀%20Kaynak%20Kodu-İncele-purple?style=for-the-badge&logo=github&logoColor=white" /></a>
  <a href="#-türkçe-dokümantasyon"><img src="https://img.shields.io/badge/🇹🇷%20TR-Doküman-red?style=for-the-badge" /></a>
  <a href="#-deutsche-dokumentation"><img src="https://img.shields.io/badge/🇩🇪%20DE-Doku-black?style=for-the-badge" /></a>
</div>

---

## 📈 Detailed Code Specifications
The application pipeline enforces strict asynchronous thread scheduling:
* **SunAI Background Routines:** Operate strictly on priority worker threads to eliminate UI blocking.
* **Memory Management:** Memory buffers for **BanaRaunt** matchmaking data utilize static arrays inside the native C++ layer to completely bypass Java Garbage Collection (GC) pauses during intensive operational states.

---

## 🇹🇷 TÜRKÇE DOKÜMANTASYON

### 📝 Proje Genel Bakışı
Marmara Games Resmi Android Uygulaması'nın kaynak kod deposuna hoş geldiniz. Bu depo, mobil ekosistemimizin temelini oluşturan, yüksek performanslı **C++ Çekirdek Yapısı** ve esnek **Java Android SDK** mimarisi kullanılarak sıfırdan geliştirilmiş açık kaynak kodlu altyapıyı içerir.

Bu mobil yazılım paketi, Marmara Games'in resmi akıllı asistanı olan **SunAI** sistemini barındırır. SunAI, kullanıcı ayarlarını koordine eden, sistem performans testlerini gerçekleştiren ve tüm yazılım ekosistemimiz için veri senkronizasyonu sağlayan dinamik bir yönetim katmanıdır.

Bu modern uygulama, geçmişte yayınladığımız *SJ App Store* gibi eski uygulamalarımızdan elde edilen teknolojik tecrübelerin üzerine inşa edilerek merkezi bir oyun ve asistan platformuna dönüştürülmüştür.

### 👔 Üst Yönetim ve İdari Kadro
| Görev | İsim | Rolü & Detayları |
| :--- | :--- | :--- |
| **Üst Yönetici (CEO)** | `Mert Ali Çıkrık` | Stratejik Yönetim ve İş Geliştirme |
| **Kurucu Yazılım Geliştirici & Baş Mimar** | `Burak Dönmez` | Motor Mimarisi, C++ Çekirdek Geliştirme, Sistem Tasarımı |

### 🎮 Ürün Yol Haritası ve Stratejik Ortaklıklar
* **BanaRaunt:** Geliştirme süreçlerinin son aşamasında olan, ultra grafik motoruna, özel gölgelendirici (shader) önbelleğe alma sistemine ve donanım tıkanmalarını önleyen saf FPS optimizasyon modüllerine sahip profesyonel rekabetçi oyunumuz.
* **Ege Games Ortaklığı:** Resmi ortağımız Ege Games tarafından tasarlanan yenilikçi uygulamaların, interaktif araçların ve stratejik oyun çözümlerinin sisteme yerel olarak entegrasyonu.
* **SunAI Akıllı Modülleri:** Kullanıcı komutlarını anında işleyen, cihaz kaynaklarını optimize eden entegre asistan altyapısı.

### 🛠 Teknik Altyapı ve Yazılım Mimarisi
* 🟦 **Yerel Çekirdek (C++):** Android NDK (Native Development Kit) kullanılarak yazılmıştır. Düşük gecikmeli varlık işleme, çoklu iş parçacığı (multi-threading) yönetimi ve bellek optimizasyonundan sorumludur.
* 🟧 **Uygulama Katmanı (Java):** Modern SDK bileşenleri ile geliştirilmiştir. Kullanıcı arayüzünde cyberpunk esintili, pürüzsüz geçişlere sahip profesyonel bir tasarım sunar.

---

## 🇩🇪 DEUTSCHE DOKUMENTATION

### 📝 Projektübersicht
Willkommen im offiziellen Quellcode-Repository der Marmara Games Android Applikation. Dieses Repository enthält die Open-Source-Infrastruktur unseres mobilen Ökosystems, die auf einer performanten C++ Core-Struktur und dem flexiblen Java Android SDK aufbaut.

Dieses Softwarepaket enthält **SunAI**, den offiziellen intelligenten Assistenten von Marmara Games. SunAI verwaltet Benutzereinstellungen, führt Leistungsbenchmarks durch und synchronisiert Daten für das gesamte Software-Ökosystem.

Diese moderne Anwendung baut auf den technologischen Erkenntnissen älterer Apps wie dem *SJ App Store* auf und wurde zu einer zentralen Gaming-Hub-Plattform weiterentwickelt.

### 👔 Unternehmensführung und Administration
* **Geschäftsführer (CEO):** Mert Ali Çıkrık
* **Gründer & Chefentwickler:** Burak Dönmez
* **Offizielles Firmenportal:** marmaragames.oneapp.dev

---

## 🇫🇷 DOCUMENTATION FRANÇAISE

### 📝 Aperçu du Projet
Bienvenue dans le dépôt officiel du code source de l'Application Android Marmara Games. Cette infrastructure combine la puissance native de C++ et la flexibilité du Java Android SDK.

Cette suite logicielle intègre **SunAI**, l'assistant intelligent officiel de Marmara Games. SunAI orchestre les configurations utilisateur et optimise la synchronisation des données au sein de notre écosystème.

### 👔 Direction et Administration
* **Directeur Général (CEO):** Mert Ali Çıkrık
* **Développeur Fondateur & Architecte Principal:** Burak Dönmez

---

## ☀️ DOKUMANTASYONA KURDÎ

### 📝 Sersaxiya Projeyê
Bi xêr hatin depoya kodên çavkaniyê ya Appa Android a Fermî ya Marmara Games. Ev depo binesaziya koda vekirî ya ku bi performansa bilind a C++ Core û mîmariya asan a Java Android SDK hatiye afirandin, dihewîne.

### 👔 Rêveberiya Giştî
* **Rêveberê Giştî (CEO):** Mert Ali Çıkrık
* **Avaker & Berhevkarê Sereke yê Nivîsbariyê:** Burak Dönmez

---

<div align="center" style="background: linear-gradient(135deg, #1f1c2c, #928dab); padding: 20px; border-radius: 10px; margin-top: 30px;">
  <h3 style="color: #00ffcc; margin-top: 0;">✨ Geliştirici Notu & Proje Sahibi</h3>
  <p style="color: #ffffff; font-size: 1.1em;">
    Bu yazılım mimarisi, tüm C++ performans optimizasyonları, asenkron thread yönetimi ve alt sistem bağlantıları dahil olmak üzere, projenin kurucusu, yazılımcısı ve baş mimarı <strong>Burak Dönmez</strong> tarafından tasarlanııp hayata geçirilmiştir.
  </p>
  <code style="color: #ff007f; font-weight: bold; background: rgba(0,0,0,0.4); padding: 5px 10px; border-radius: 5px;">
    Marmara Games © 2026 - All Rights Reserved.
  </code>
</div>
