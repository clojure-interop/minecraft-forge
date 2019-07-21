(ns net.minecraftforge.fml.common.registry.IForgeRegistryEntry$Impl
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry IForgeRegistryEntry$Impl]))

(defn ->impl
  "Constructor."
  (^IForgeRegistryEntry$Impl []
    (new IForgeRegistryEntry$Impl )))

(defn delegate
  "Instance Constant.

  type: net.minecraftforge.fml.common.registry.RegistryDelegate<T extends net.minecraftforge.fml.common.registry.IForgeRegistryEntry<T>>"
  ([^IForgeRegistryEntry$Impl this]
    (-> this .-delegate)))

(defn set-registry-name
  "Description copied from interface: IForgeRegistryEntry

  name - Unique registry name - `net.minecraft.util.ResourceLocation`

  returns: This instance - `T`"
  ([^IForgeRegistryEntry$Impl this ^net.minecraft.util.ResourceLocation name]
    (-> this (.setRegistryName name)))
  ([^IForgeRegistryEntry$Impl this ^java.lang.String mod-id ^java.lang.String name]
    (-> this (.setRegistryName mod-id name))))

(defn get-registry-name
  "Description copied from interface: IForgeRegistryEntry

  returns: Unique identifier or null. - `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^IForgeRegistryEntry$Impl this]
    (-> this (.getRegistryName))))

(defn get-registry-type
  "returns: `java.lang.Class<? super T>`"
  ([^IForgeRegistryEntry$Impl this]
    (-> this (.getRegistryType))))

