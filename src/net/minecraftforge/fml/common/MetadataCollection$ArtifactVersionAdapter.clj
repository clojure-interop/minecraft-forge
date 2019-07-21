(ns net.minecraftforge.fml.common.MetadataCollection$ArtifactVersionAdapter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common MetadataCollection$ArtifactVersionAdapter]))

(defn ->artifact-version-adapter
  "Constructor."
  (^MetadataCollection$ArtifactVersionAdapter []
    (new MetadataCollection$ArtifactVersionAdapter )))

(defn write
  "out - `com.google.gson.stream.JsonWriter`
  value - `net.minecraftforge.fml.common.versioning.ArtifactVersion`

  throws: java.io.IOException"
  ([^MetadataCollection$ArtifactVersionAdapter this ^com.google.gson.stream.JsonWriter out ^net.minecraftforge.fml.common.versioning.ArtifactVersion value]
    (-> this (.write out value))))

(defn read
  "in - `com.google.gson.stream.JsonReader`

  returns: `net.minecraftforge.fml.common.versioning.ArtifactVersion`

  throws: java.io.IOException"
  (^net.minecraftforge.fml.common.versioning.ArtifactVersion [^MetadataCollection$ArtifactVersionAdapter this ^com.google.gson.stream.JsonReader in]
    (-> this (.read in))))

