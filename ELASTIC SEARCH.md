Big Data türünde yapılarda , full text search(tam metin arama) işlemlerinde kullanılan Document based NoSQL teknolojisidir.
Apache SOLR ve Lucene projelerini baz alır.
Açık kaynak kodlu.
Java ile kodlanmıştır.
Restfull web servis arayüzünden erişebilisiniz. Json tipli documentlar ile datayı tutar.

# ELK
Elastic Search, Logstash, Kibana
Beats

# Full Text Search?
Veri içindeki tüm kelimeleri tarayıp, kullanıcının girdiği veri ile tam eşleşen veya belirli algoritmalarla belirlenmiş bazı eksik veya yanlış girdileri de kabul ederek sonuç döndürebilen arama yöntemidir.
Tam olarak eşleşmese bile eşleşme oranını hesaplayarak en yüksekten en alçağa doğru önerilerini sıralar.

# Inverted Index nedir?
Belirli bir dökümandaki kelimelerin ve hangi dökümanda geçtiklerinin tutulduğu index çeşididir.
Ana işlevi aranan terimlerin hangi dökümanda geçtiğini hızlıca bulabilmektir.

# ElasticSearch Avantajları?
Çok hızlı bir şekilde indexleme gerçekleşebilir ve arama yapılaiblir.
Cluster mimarisi sayesinde çok hızlı bir şekilde ölçeklenebilir. Yani yeni replicalar türetilebilir veya kaldırılabilir.
Açık kaynak desteği vardır.
Metin madenciliği, log analizi, gerçek zamanlı grafiksel analizde yardımcı olabilir.
Restfull desteği vardır. Http metodları ile ElasticSearch'e ulaşabilirsiniz. (GET POST PUT DELETE metodları ile)

# Index
Documentların tutulduğu yer.

# Document
Relational Database'deki karşılığı row'dur. 

# Field
Document içinde her bir parça. Alan.


# Cluster
Node'ları içeren yapıdır.

# Node
ElasticSearch'in çalıştığı sanal bir sunucudur.

# Shard
Verinin parçalanarak tutulabileceği bölümlere verilen isim.

# Replica
Kopyaların tutulacağı makinalar.

Index: Database
Document: Row
Fields: Column

# Kibana
Veri görselleştirme ve analiz için kullanılır. Ayrıca Devtools altından Queryler gönderilerek ElasticSearch içinde veriler incelenebilir.

# ElasticSearch portları
9200: Dışarıya açılır ve HTTP requestleri buradan gönderilir.
9300: Birden çok node olduğunda nodelar arası iletişim için kullanılır.


docker run --name es01 --net elastic -d -p 9200:9200 -e "discovery.type=single-node" -it -m 1GB docker.elastic.co/elasticsearch/elasticsearch:8.11.3


docker run -d -p 5601:5601 --name=my_kibana --net elastic  docker.elastic.co/kibana/kibana:8.11.3




