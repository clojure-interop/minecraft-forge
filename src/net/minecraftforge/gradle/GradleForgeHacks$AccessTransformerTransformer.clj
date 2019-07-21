(ns net.minecraftforge.gradle.GradleForgeHacks$AccessTransformerTransformer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.gradle GradleForgeHacks$AccessTransformerTransformer]))

(defn ->access-transformer-transformer
  "Constructor."
  (^GradleForgeHacks$AccessTransformerTransformer []
    (new GradleForgeHacks$AccessTransformerTransformer )))

(defn transform
  "name - `java.lang.String`
  transformed-name - `java.lang.String`
  basic-class - `byte[]`

  returns: `byte[]`"
  ([^GradleForgeHacks$AccessTransformerTransformer this ^java.lang.String name ^java.lang.String transformed-name basic-class]
    (-> this (.transform name transformed-name basic-class))))

