(ns net.minecraftforge.fml.common.registry.ExistingSubstitutionException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry ExistingSubstitutionException]))

(defn ->existing-substitution-exception
  "Constructor.

  from-name - `net.minecraft.util.ResourceLocation`
  to-replace - `java.lang.Object`"
  (^ExistingSubstitutionException [^net.minecraft.util.ResourceLocation from-name ^java.lang.Object to-replace]
    (new ExistingSubstitutionException from-name to-replace)))

