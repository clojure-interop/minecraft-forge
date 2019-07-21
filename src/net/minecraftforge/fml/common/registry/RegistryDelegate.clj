(ns net.minecraftforge.fml.common.registry.RegistryDelegate
  "A registry delegate for holding references to items or blocks
  These should be safe to use in things like lists though aliased items and blocks will not
  have object identity with respect to their delegate."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry RegistryDelegate]))

(defn get
  "Get the referent pointed at by this delegate. This will be the currently active item or block, and will change
   as world saves come and go. Note that item.delegate.get() may NOT be the same object as item, due to item and
   block substitution.

  returns: The referred object - `T`"
  ([^RegistryDelegate this]
    (-> this (.get))))

(defn name
  "Get the unique resource location for this delegate. Completely static after registration has completed, and
   will never change.

  returns: The name - `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^RegistryDelegate this]
    (-> this (.name))))

(defn type
  "Get the delegate type. It will be dependent on the registry this delegate is sourced from.

  returns: The type of delegate - `java.lang.Class<T>`"
  (^java.lang.Class [^RegistryDelegate this]
    (-> this (.type))))

