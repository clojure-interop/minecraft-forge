(ns net.minecraftforge.fml.common.registry.IncompatibleSubstitutionException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry IncompatibleSubstitutionException]))

(defn ->incompatible-substitution-exception
  "Constructor.

  from-name - `net.minecraft.util.ResourceLocation`
  replacement - `java.lang.Object`
  original - `java.lang.Object`"
  (^IncompatibleSubstitutionException [^net.minecraft.util.ResourceLocation from-name ^java.lang.Object replacement ^java.lang.Object original]
    (new IncompatibleSubstitutionException from-name replacement original)))

