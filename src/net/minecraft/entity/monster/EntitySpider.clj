(ns net.minecraft.entity.monster.EntitySpider
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntitySpider]))

(defn ->entity-spider
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntitySpider [^net.minecraft.world.World world-in]
    (new EntitySpider world-in)))

(defn *register-fixes-spider
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntitySpider/registerFixesSpider fixer)))

(defn beside-climbable-block?
  "returns: `boolean`"
  (^Boolean [^EntitySpider this]
    (-> this (.isBesideClimbableBlock))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntitySpider this]
    (-> this (.getEyeHeight))))

(defn on-update
  ""
  ([^EntitySpider this]
    (-> this (.onUpdate))))

(defn potion-applicable?
  "potioneffect-in - `net.minecraft.potion.PotionEffect`

  returns: `boolean`"
  (^Boolean [^EntitySpider this ^net.minecraft.potion.PotionEffect potioneffect-in]
    (-> this (.isPotionApplicable potioneffect-in))))

(defn set-in-web
  ""
  ([^EntitySpider this]
    (-> this (.setInWeb))))

(defn on-ladder?
  "returns: `boolean`"
  (^Boolean [^EntitySpider this]
    (-> this (.isOnLadder))))

(defn get-creature-attribute
  "returns: `net.minecraft.entity.EnumCreatureAttribute`"
  (^net.minecraft.entity.EnumCreatureAttribute [^EntitySpider this]
    (-> this (.getCreatureAttribute))))

(defn set-beside-climbable-block
  "climbing - `boolean`"
  ([^EntitySpider this ^Boolean climbing]
    (-> this (.setBesideClimbableBlock climbing))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^EntitySpider this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

(defn get-mounted-y-offset
  "returns: `double`"
  (^Double [^EntitySpider this]
    (-> this (.getMountedYOffset))))

