(ns net.minecraftforge.fml.common.registry.PersistentRegistryManager
  "Persistent registry manager. Manages the registries loading from disk, and from network. Handles staging
  registry data before loading uniformly into the active registry, and keeps a frozen registry instance
  for reversion after connection."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry PersistentRegistryManager]))

(defn ->persistent-registry-manager
  "Constructor."
  (^PersistentRegistryManager []
    (new PersistentRegistryManager )))

(def *-blocks
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  PersistentRegistryManager/BLOCKS)

(def *-items
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  PersistentRegistryManager/ITEMS)

(def *-potions
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  PersistentRegistryManager/POTIONS)

(def *-biomes
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  PersistentRegistryManager/BIOMES)

(def *-soundevents
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  PersistentRegistryManager/SOUNDEVENTS)

(def *-potiontypes
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  PersistentRegistryManager/POTIONTYPES)

(def *-enchantments
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  PersistentRegistryManager/ENCHANTMENTS)

(def *-entities
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  PersistentRegistryManager/ENTITIES)

(defn *fire-create-registry-events
  ""
  ([]
    (PersistentRegistryManager/fireCreateRegistryEvents )))

(defn *fire-registry-events
  ""
  ([]
    (PersistentRegistryManager/fireRegistryEvents )))

(defn *create-registry
  "Deprecated.

  registry-name - `net.minecraft.util.ResourceLocation`
  registry-type - `java.lang.Class`
  optional-default-key - `net.minecraft.util.ResourceLocation`
  min-id - `int`
  max-id - `int`
  has-delegates - `boolean`
  add-callback - `net.minecraftforge.fml.common.registry.IForgeRegistry$AddCallback`
  clear-callback - `net.minecraftforge.fml.common.registry.IForgeRegistry$ClearCallback`
  create-callback - `net.minecraftforge.fml.common.registry.IForgeRegistry$CreateCallback`

  returns: `<T extends net.minecraftforge.fml.common.registry.IForgeRegistryEntry<T>> net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry<T>`"
  ([^net.minecraft.util.ResourceLocation registry-name ^java.lang.Class registry-type ^net.minecraft.util.ResourceLocation optional-default-key ^Integer min-id ^Integer max-id ^Boolean has-delegates ^net.minecraftforge.fml.common.registry.IForgeRegistry$AddCallback add-callback ^net.minecraftforge.fml.common.registry.IForgeRegistry$ClearCallback clear-callback ^net.minecraftforge.fml.common.registry.IForgeRegistry$CreateCallback create-callback]
    (PersistentRegistryManager/createRegistry registry-name registry-type optional-default-key min-id max-id has-delegates add-callback clear-callback create-callback))
  ([^net.minecraft.util.ResourceLocation registry-name ^java.lang.Class registry-type ^net.minecraft.util.ResourceLocation optional-default-key ^Integer min-id ^Integer max-id ^Boolean has-delegates ^net.minecraftforge.fml.common.registry.IForgeRegistry$AddCallback add-callback ^net.minecraftforge.fml.common.registry.IForgeRegistry$ClearCallback clear-callback ^net.minecraftforge.fml.common.registry.IForgeRegistry$CreateCallback create-callback ^net.minecraftforge.fml.common.registry.IForgeRegistry$SubstitutionCallback substitution-callback]
    (PersistentRegistryManager/createRegistry registry-name registry-type optional-default-key min-id max-id has-delegates add-callback clear-callback create-callback substitution-callback)))

(defn *inject-snapshot
  "snapshot - `net.minecraftforge.fml.common.registry.PersistentRegistryManager$GameDataSnapshot`
  inject-frozen-data - `boolean`
  is-local-world - `boolean`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^net.minecraftforge.fml.common.registry.PersistentRegistryManager$GameDataSnapshot snapshot ^Boolean inject-frozen-data ^Boolean is-local-world]
    (PersistentRegistryManager/injectSnapshot snapshot inject-frozen-data is-local-world)))

(defn *revert-to-frozen
  ""
  ([]
    (PersistentRegistryManager/revertToFrozen )))

(defn *process-id-rematches
  "missed-mappings - `java.lang.Iterable`
  is-local-world - `boolean`
  missing-blocks - `java.util.Map`
  missing-items - `java.util.Map`
  remap-blocks - `java.util.Map`
  remap-items - `java.util.Map`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^java.lang.Iterable missed-mappings ^Boolean is-local-world ^java.util.Map missing-blocks ^java.util.Map missing-items ^java.util.Map remap-blocks ^java.util.Map remap-items]
    (PersistentRegistryManager/processIdRematches missed-mappings is-local-world missing-blocks missing-items remap-blocks remap-items)))

(defn *freeze-vanilla
  ""
  ([]
    (PersistentRegistryManager/freezeVanilla )))

(defn *freeze-data
  ""
  ([]
    (PersistentRegistryManager/freezeData )))

(defn *make-delegate
  "obj - `T`
  root-class - `java.lang.Class`

  returns: `<T extends net.minecraftforge.fml.common.registry.IForgeRegistryEntry<T>> net.minecraftforge.fml.common.registry.RegistryDelegate<T>`"
  ([obj ^java.lang.Class root-class]
    (PersistentRegistryManager/makeDelegate obj root-class)))

(defn *take-snapshot
  "returns: `net.minecraftforge.fml.common.registry.PersistentRegistryManager$GameDataSnapshot`"
  (^net.minecraftforge.fml.common.registry.PersistentRegistryManager$GameDataSnapshot []
    (PersistentRegistryManager/takeSnapshot )))

(defn *frozen?
  "registry - `net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry`

  returns: `boolean`"
  (^Boolean [^net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry registry]
    (PersistentRegistryManager/isFrozen registry)))

