(ns net.minecraftforge.fml.common.asm.transformers.ModAccessTransformer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm.transformers ModAccessTransformer]))

(defn ->mod-access-transformer
  "Constructor.

  throws: java.lang.Exception"
  (^ModAccessTransformer []
    (new ModAccessTransformer )))

(defn *add-jar
  "jar - `java.util.jar.JarFile`

  throws: java.io.IOException"
  ([^java.util.jar.JarFile jar]
    (ModAccessTransformer/addJar jar)))

