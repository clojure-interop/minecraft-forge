(ns net.minecraftforge.fml.common.registry.IForgeRegistryEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry IForgeRegistryEntry]))

(defn set-registry-name
  "Sets a unique name for this Item. This should be used for uniquely identify the instance of the Item.
   This is the valid replacement for the atrocious 'getUnlocalizedName().substring(6)' stuff that everyone does.
   Unlocalized names have NOTHING to do with unique identifiers. As demonstrated by vanilla blocks and items.

   The supplied name will be prefixed with the currently active mod's modId.
   If the supplied name already has a prefix that is different, it will be used and a warning will be logged.

   If a name already exists, or this Item is already registered in a registry, then an IllegalStateException is thrown.

   Returns 'this' to allow for chaining.

  name - Unique registry name - `net.minecraft.util.ResourceLocation`

  returns: This instance - `V`"
  ([^IForgeRegistryEntry this ^net.minecraft.util.ResourceLocation name]
    (-> this (.setRegistryName name))))

(defn get-registry-name
  "A unique identifier for this entry, if this entry is registered already it will return it's official registry name.
   Otherwise it will return the name set in setRegistryName().
   If neither are valid null is returned.

  returns: Unique identifier or null. - `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^IForgeRegistryEntry this]
    (-> this (.getRegistryName))))

(defn get-registry-type
  "returns: `java.lang.Class<? super V>`"
  ([^IForgeRegistryEntry this]
    (-> this (.getRegistryType))))

