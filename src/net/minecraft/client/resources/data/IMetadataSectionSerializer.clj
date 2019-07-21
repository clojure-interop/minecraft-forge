(ns net.minecraft.client.resources.data.IMetadataSectionSerializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources.data IMetadataSectionSerializer]))

(defn get-section-name
  "returns: `java.lang.String`"
  (^java.lang.String [^IMetadataSectionSerializer this]
    (-> this (.getSectionName))))

