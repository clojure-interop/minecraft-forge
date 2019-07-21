(ns net.minecraftforge.fml.common.registry.RegistryBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry RegistryBuilder]))

(defn ->registry-builder
  "Constructor."
  (^RegistryBuilder []
    (new RegistryBuilder )))

(defn set-name
  "name - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraftforge.fml.common.registry.RegistryBuilder<T>`"
  (^net.minecraftforge.fml.common.registry.RegistryBuilder [^RegistryBuilder this ^net.minecraft.util.ResourceLocation name]
    (-> this (.setName name))))

(defn set-type
  "type - `java.lang.Class`

  returns: `net.minecraftforge.fml.common.registry.RegistryBuilder<T>`"
  (^net.minecraftforge.fml.common.registry.RegistryBuilder [^RegistryBuilder this ^java.lang.Class type]
    (-> this (.setType type))))

(defn set-id-range
  "min - `int`
  max - `int`

  returns: `net.minecraftforge.fml.common.registry.RegistryBuilder<T>`"
  (^net.minecraftforge.fml.common.registry.RegistryBuilder [^RegistryBuilder this ^Integer min ^Integer max]
    (-> this (.setIDRange min max))))

(defn add-callback
  "inst - `java.lang.Object`

  returns: `net.minecraftforge.fml.common.registry.RegistryBuilder<T>`"
  (^net.minecraftforge.fml.common.registry.RegistryBuilder [^RegistryBuilder this ^java.lang.Object inst]
    (-> this (.addCallback inst))))

(defn add
  "add - `net.minecraftforge.fml.common.registry.IForgeRegistry$AddCallback`

  returns: `net.minecraftforge.fml.common.registry.RegistryBuilder<T>`"
  (^net.minecraftforge.fml.common.registry.RegistryBuilder [^RegistryBuilder this ^net.minecraftforge.fml.common.registry.IForgeRegistry$AddCallback add]
    (-> this (.add add))))

(defn create
  "returns: `net.minecraftforge.fml.common.registry.IForgeRegistry<T>`"
  (^net.minecraftforge.fml.common.registry.IForgeRegistry [^RegistryBuilder this]
    (-> this (.create))))

