(ns net.minecraftforge.fml.common.MetadataCollection
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common MetadataCollection]))

(defn ->metadata-collection
  "Constructor."
  (^MetadataCollection []
    (new MetadataCollection )))

(defn *from
  "input-stream - `java.io.InputStream`
  source-name - `java.lang.String`

  returns: `net.minecraftforge.fml.common.MetadataCollection`"
  (^net.minecraftforge.fml.common.MetadataCollection [^java.io.InputStream input-stream ^java.lang.String source-name]
    (MetadataCollection/from input-stream source-name)))

(defn get-metadata-for-id
  "mod-id - `java.lang.String`
  extra-data - `java.util.Map`

  returns: `net.minecraftforge.fml.common.ModMetadata`"
  (^net.minecraftforge.fml.common.ModMetadata [^MetadataCollection this ^java.lang.String mod-id ^java.util.Map extra-data]
    (-> this (.getMetadataForId mod-id extra-data))))

