(ns net.minecraftforge.fml.common.asm.transformers.EventSubscriptionTransformer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm.transformers EventSubscriptionTransformer]))

(defn ->event-subscription-transformer
  "Constructor."
  (^EventSubscriptionTransformer []
    (new EventSubscriptionTransformer )))

(defn transform
  "name - `java.lang.String`
  transformed-name - `java.lang.String`
  bytes - `byte[]`

  returns: `byte[]`"
  ([^EventSubscriptionTransformer this ^java.lang.String name ^java.lang.String transformed-name bytes]
    (-> this (.transform name transformed-name bytes))))

