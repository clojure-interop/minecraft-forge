(ns net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry FMLControlledNamespacedRegistry]))

(def *-debug
  "Static Constant.

  type: boolean"
  FMLControlledNamespacedRegistry/DEBUG)

(defn serialize-substitutions
  "set - `java.util.Set`"
  ([^FMLControlledNamespacedRegistry this ^java.util.Set set]
    (-> this (.serializeSubstitutions set))))

(defn type-safe-iterable
  "returns: `java.lang.Iterable<I>`"
  (^java.lang.Iterable [^FMLControlledNamespacedRegistry this]
    (-> this (.typeSafeIterable))))

(defn get-values
  "returns: `java.util.List<I>`"
  (^java.util.List [^FMLControlledNamespacedRegistry this]
    (-> this (.getValues))))

(defn get-raw
  "Get the object identified by the specified id.

  id - Block/Item id. - `int`

  returns: Block/Item object or null if it wasn't found. - `I`"
  ([^FMLControlledNamespacedRegistry this ^Integer id]
    (-> this (.getRaw id))))

(defn get-name-for-object
  "p-177774-1 - `I`

  returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^FMLControlledNamespacedRegistry this p-177774-1]
    (-> this (.getNameForObject p-177774-1))))

(defn as-type
  "type - `java.lang.Class`

  returns: `<T extends net.minecraftforge.fml.common.registry.IForgeRegistryEntry<T>> net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry<T>`"
  ([^FMLControlledNamespacedRegistry this ^java.lang.Class type]
    (-> this (.asType type))))

(defn load-substitutions
  "substitutions - `java.util.Set`"
  ([^FMLControlledNamespacedRegistry this ^java.util.Set substitutions]
    (-> this (.loadSubstitutions substitutions))))

(defn get-registry-super-type
  "returns: `java.lang.Class<I>`"
  (^java.lang.Class [^FMLControlledNamespacedRegistry this]
    (-> this (.getRegistrySuperType))))

(defn get-delegate
  "thing - `I`
  clazz - `java.lang.Class`

  returns: `net.minecraftforge.fml.common.registry.RegistryDelegate<I>`"
  (^net.minecraftforge.fml.common.registry.RegistryDelegate [^FMLControlledNamespacedRegistry this thing ^java.lang.Class clazz]
    (-> this (.getDelegate thing clazz))))

(defn dummied?
  "key - `net.minecraft.util.ResourceLocation`

  returns: `boolean`"
  (^Boolean [^FMLControlledNamespacedRegistry this ^net.minecraft.util.ResourceLocation key]
    (-> this (.isDummied key))))

(defn register-all
  "values - `I`"
  ([^FMLControlledNamespacedRegistry this values]
    (-> this (.registerAll values))))

(defn get-key
  "value - `I`

  returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^FMLControlledNamespacedRegistry this value]
    (-> this (.getKey value))))

(defn serialize-aliases
  "map - `java.util.Map`"
  ([^FMLControlledNamespacedRegistry this ^java.util.Map map]
    (-> this (.serializeAliases map))))

(defn get-object
  "Fetch the object identified by the specified name or the default object.

   For blocks the default object is the air block, for items it's null.

  name - Unique name identifying the object. - `net.minecraft.util.ResourceLocation`

  returns: Registered object of the default object if it wasn't found- - `I`"
  ([^FMLControlledNamespacedRegistry this ^net.minecraft.util.ResourceLocation name]
    (-> this (.getObject name))))

(defn get-default-value
  "returns: `I`"
  ([^FMLControlledNamespacedRegistry this]
    (-> this (.getDefaultValue))))

(defn serialize-block-list
  "blocked - `java.util.Set`"
  ([^FMLControlledNamespacedRegistry this ^java.util.Set blocked]
    (-> this (.serializeBlockList blocked))))

(defn get-value
  "key - `net.minecraft.util.ResourceLocation`

  returns: `I`"
  ([^FMLControlledNamespacedRegistry this ^net.minecraft.util.ResourceLocation key]
    (-> this (.getValue key))))

(defn iterator
  "returns: `java.util.Iterator<I>`"
  (^java.util.Iterator [^FMLControlledNamespacedRegistry this]
    (-> this (.iterator))))

(defn contains-value
  "value - `I`

  returns: `boolean`"
  (^Boolean [^FMLControlledNamespacedRegistry this value]
    (-> this (.containsValue value))))

(defn serialize-ids
  "id-mapping - `java.util.Map`"
  ([^FMLControlledNamespacedRegistry this ^java.util.Map id-mapping]
    (-> this (.serializeIds id-mapping))))

(defn get-slave-map
  "Description copied from interface: IForgeRegistry

  slave-map-name - The name of the slavemap - `net.minecraft.util.ResourceLocation`
  type - The type - `java.lang.Class`

  returns: The slavemap if present - `<T> T`"
  ([^FMLControlledNamespacedRegistry this ^net.minecraft.util.ResourceLocation slave-map-name ^java.lang.Class type]
    (-> this (.getSlaveMap slave-map-name type))))

(defn validate-key
  ""
  ([^FMLControlledNamespacedRegistry this]
    (-> this (.validateKey))))

(defn get-keys
  "returns: `java.util.Set<net.minecraft.util.ResourceLocation>`"
  (^java.util.Set [^FMLControlledNamespacedRegistry this]
    (-> this (.getKeys))))

(defn serialize-dummied
  "set - `java.util.Set`"
  ([^FMLControlledNamespacedRegistry this ^java.util.Set set]
    (-> this (.serializeDummied set))))

(defn get-entries
  "returns: `java.util.Set<java.util.Map.Entry<net.minecraft.util.ResourceLocation,I>>`"
  (^java.util.Set [^FMLControlledNamespacedRegistry this]
    (-> this (.getEntries))))

(defn get-id
  "Get the id for the specified object.

   Don't hold onto the id across the world, it's being dynamically re-mapped as needed.

   Usually the name should be used instead of the id, if using the Block/Item object itself is
   not suitable for the task.

  thing - Block/Item object. - `I`

  returns: Block/Item id or -1 if it wasn't found. - `int`"
  (^Integer [^FMLControlledNamespacedRegistry this thing]
    (-> this (.getId thing))))

(defn register
  "value - `I`"
  ([^FMLControlledNamespacedRegistry this value]
    (-> this (.register value)))
  ([^FMLControlledNamespacedRegistry this ^Integer id ^net.minecraft.util.ResourceLocation name thing]
    (-> this (.register id name thing))))

(defn notify-callbacks
  ""
  ([^FMLControlledNamespacedRegistry this]
    (-> this (.notifyCallbacks))))

(defn get-object-by-id
  "Fetch the object identified by the specified id or the default object.

   For blocks the default object is the air block, for items it's null.

  id - ID identifying the object. - `int`

  returns: Registered object of the default object if it wasn't found- - `I`"
  ([^FMLControlledNamespacedRegistry this ^Integer id]
    (-> this (.getObjectById id))))

(defn load-aliases
  "aliases - `java.util.Map`"
  ([^FMLControlledNamespacedRegistry this ^java.util.Map aliases]
    (-> this (.loadAliases aliases))))

(defn load-ids
  "ids - `java.util.Map`
  missing-ids - `java.util.Map`
  remapped-ids - `java.util.Map`
  current-registry - `net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry`
  registry-name - `net.minecraft.util.ResourceLocation`"
  ([^FMLControlledNamespacedRegistry this ^java.util.Map ids ^java.util.Map missing-ids ^java.util.Map remapped-ids ^net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry current-registry ^net.minecraft.util.ResourceLocation registry-name]
    (-> this (.loadIds ids missing-ids remapped-ids current-registry registry-name))))

(defn load-blocked
  "blocked - `java.util.Set`"
  ([^FMLControlledNamespacedRegistry this ^java.util.Set blocked]
    (-> this (.loadBlocked blocked))))

(defn get-active-substitutions
  "returns: `java.util.Set<? extends net.minecraft.util.ResourceLocation>`"
  ([^FMLControlledNamespacedRegistry this]
    (-> this (.getActiveSubstitutions))))

(defn load-dummied
  "dummied - `java.util.Set`"
  ([^FMLControlledNamespacedRegistry this ^java.util.Set dummied]
    (-> this (.loadDummied dummied))))

(defn contains-key
  "Determine if the registry has an entry for the specified name.

   Aliased names will be resolved as well.

  name - Object name to check. - `net.minecraft.util.ResourceLocation`

  returns: true if a matching entry was found. - `boolean`"
  (^Boolean [^FMLControlledNamespacedRegistry this ^net.minecraft.util.ResourceLocation name]
    (-> this (.containsKey name))))

(defn put-object
  "Deprecated. register through GameRegistry instead.

  name - `net.minecraft.util.ResourceLocation`
  thing - `I`"
  ([^FMLControlledNamespacedRegistry this ^net.minecraft.util.ResourceLocation name thing]
    (-> this (.putObject name thing))))

(defn block-id
  "id - `int`"
  ([^FMLControlledNamespacedRegistry this ^Integer id]
    (-> this (.blockId id))))

