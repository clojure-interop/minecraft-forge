(ns net.minecraft.client.ClientBrandRetriever
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client ClientBrandRetriever]))

(defn ->client-brand-retriever
  "Constructor."
  (^ClientBrandRetriever []
    (new ClientBrandRetriever )))

(defn *get-client-mod-name
  "returns: `java.lang.String`"
  (^java.lang.String []
    (ClientBrandRetriever/getClientModName )))

