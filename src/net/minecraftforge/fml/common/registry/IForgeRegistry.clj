(ns net.minecraftforge.fml.common.registry.IForgeRegistry
  "Main interface for the registry system. Use this to query the registry system."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry IForgeRegistry]))

(defn get-values
  "returns: `java.util.List<V>`"
  (^java.util.List [^IForgeRegistry this]
    (-> this (.getValues))))

(defn get-registry-super-type
  "returns: `java.lang.Class<V>`"
  (^java.lang.Class [^IForgeRegistry this]
    (-> this (.getRegistrySuperType))))

(defn register-all
  "values - `V`"
  ([^IForgeRegistry this values]
    (-> this (.registerAll values))))

(defn get-key
  "value - `V`

  returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^IForgeRegistry this value]
    (-> this (.getKey value))))

(defn get-value
  "key - `net.minecraft.util.ResourceLocation`

  returns: `V`"
  ([^IForgeRegistry this ^net.minecraft.util.ResourceLocation key]
    (-> this (.getValue key))))

(defn contains-value
  "value - `V`

  returns: `boolean`"
  (^Boolean [^IForgeRegistry this value]
    (-> this (.containsValue value))))

(defn get-slave-map
  "Retrieve the slave map of type T from the registry.
   Slave maps are maps which are dependent on registry content in some way.

  slave-map-name - The name of the slavemap - `net.minecraft.util.ResourceLocation`
  type - The type - `java.lang.Class`

  returns: The slavemap if present - `<T> T`"
  ([^IForgeRegistry this ^net.minecraft.util.ResourceLocation slave-map-name ^java.lang.Class type]
    (-> this (.getSlaveMap slave-map-name type))))

(defn get-keys
  "returns: `java.util.Set<net.minecraft.util.ResourceLocation>`"
  (^java.util.Set [^IForgeRegistry this]
    (-> this (.getKeys))))

(defn get-entries
  "returns: `java.util.Set<java.util.Map.Entry<net.minecraft.util.ResourceLocation,V>>`"
  (^java.util.Set [^IForgeRegistry this]
    (-> this (.getEntries))))

(defn register
  "value - `V`"
  ([^IForgeRegistry this value]
    (-> this (.register value))))

(defn contains-key
  "key - `net.minecraft.util.ResourceLocation`

  returns: `boolean`"
  (^Boolean [^IForgeRegistry this ^net.minecraft.util.ResourceLocation key]
    (-> this (.containsKey key))))

