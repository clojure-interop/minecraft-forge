(ns net.minecraftforge.fml.common.asm.transformers.EventSubscriberTransformer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm.transformers EventSubscriberTransformer]))

(defn ->event-subscriber-transformer
  "Constructor."
  (^EventSubscriberTransformer []
    (new EventSubscriberTransformer )))

(defn transform
  "name - `java.lang.String`
  transformed-name - `java.lang.String`
  basic-class - `byte[]`

  returns: `byte[]`"
  ([^EventSubscriberTransformer this ^java.lang.String name ^java.lang.String transformed-name basic-class]
    (-> this (.transform name transformed-name basic-class))))

