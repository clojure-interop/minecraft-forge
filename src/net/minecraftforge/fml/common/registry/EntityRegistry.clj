(ns net.minecraftforge.fml.common.registry.EntityRegistry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry EntityRegistry]))

(defn *instance
  "returns: `net.minecraftforge.fml.common.registry.EntityRegistry`"
  (^net.minecraftforge.fml.common.registry.EntityRegistry []
    (EntityRegistry/instance )))

(defn *register-mod-entity
  "Register the mod entity type with FML
   This will also register a spawn egg.

  registry-name - `net.minecraft.util.ResourceLocation`
  entity-class - The entity class - `java.lang.Class`
  entity-name - A unique name for the entity - `java.lang.String`
  id - A mod specific ID for the entity - `int`
  mod - The mod - `java.lang.Object`
  tracking-range - The range at which MC will send tracking updates - `int`
  update-frequency - The frequency of tracking updates - `int`
  sends-velocity-updates - Whether to send velocity information packets as well - `boolean`
  egg-primary - Primary egg color - `int`
  egg-secondary - Secondary egg color - `int`"
  ([^net.minecraft.util.ResourceLocation registry-name ^java.lang.Class entity-class ^java.lang.String entity-name ^Integer id ^java.lang.Object mod ^Integer tracking-range ^Integer update-frequency ^Boolean sends-velocity-updates ^Integer egg-primary ^Integer egg-secondary]
    (EntityRegistry/registerModEntity registry-name entity-class entity-name id mod tracking-range update-frequency sends-velocity-updates egg-primary egg-secondary))
  ([^net.minecraft.util.ResourceLocation registry-name ^java.lang.Class entity-class ^java.lang.String entity-name ^Integer id ^java.lang.Object mod ^Integer tracking-range ^Integer update-frequency ^Boolean sends-velocity-updates]
    (EntityRegistry/registerModEntity registry-name entity-class entity-name id mod tracking-range update-frequency sends-velocity-updates)))

(defn *register-egg
  "Registers a spawn egg for the specified entity class.
   The class must already be registered in the EntityList.classToStringMapping.
   This can be done either by using the global ID system, or preferably the registerModEntity functions above.
   Once registered mob eggs can be created by using minecraft:spawn_egg with NBT entry 'entity_name' with
   value of the name this class is registered in the classToStringMapping with.

  name - The entity ResourceLocation - `net.minecraft.util.ResourceLocation`
  primary - Primary egg color - `int`
  secondary - Secondary egg color - `int`"
  ([^net.minecraft.util.ResourceLocation name ^Integer primary ^Integer secondary]
    (EntityRegistry/registerEgg name primary secondary)))

(defn *add-spawn
  "Add a spawn entry for the supplied entity in the supplied Biome list

  entity-class - Entity class added - `java.lang.Class`
  weighted-prob - Probability - `int`
  min - Min spawn count - `int`
  max - Max spawn count - `int`
  type-of-creature - Type of spawn - `net.minecraft.entity.EnumCreatureType`
  biomes - List of biomes - `net.minecraft.world.biome.Biome`"
  ([^java.lang.Class entity-class ^Integer weighted-prob ^Integer min ^Integer max ^net.minecraft.entity.EnumCreatureType type-of-creature ^net.minecraft.world.biome.Biome biomes]
    (EntityRegistry/addSpawn entity-class weighted-prob min max type-of-creature biomes)))

(defn *remove-spawn
  "Remove the spawn entry for the supplied entity

  entity-class - The entity class - `java.lang.Class`
  type-of-creature - type of spawn - `net.minecraft.entity.EnumCreatureType`
  biomes - Biomes to remove from - `net.minecraft.world.biome.Biome`"
  ([^java.lang.Class entity-class ^net.minecraft.entity.EnumCreatureType type-of-creature ^net.minecraft.world.biome.Biome biomes]
    (EntityRegistry/removeSpawn entity-class type-of-creature biomes)))

(defn *get-entry
  "entry - `java.lang.Class`

  returns: `net.minecraftforge.fml.common.registry.EntityEntry`"
  (^net.minecraftforge.fml.common.registry.EntityEntry [^java.lang.Class entry]
    (EntityRegistry/getEntry entry)))

(defn lookup-mod-spawn
  "clazz - `java.lang.Class`
  keep-looking - `boolean`

  returns: `net.minecraftforge.fml.common.registry.EntityRegistry$EntityRegistration`"
  (^net.minecraftforge.fml.common.registry.EntityRegistry$EntityRegistration [^EntityRegistry this ^java.lang.Class clazz ^Boolean keep-looking]
    (-> this (.lookupModSpawn clazz keep-looking))))

(defn try-tracking-entity
  "entity-tracker - `net.minecraft.entity.EntityTracker`
  entity - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityRegistry this ^net.minecraft.entity.EntityTracker entity-tracker ^net.minecraft.entity.Entity entity]
    (-> this (.tryTrackingEntity entity-tracker entity))))

