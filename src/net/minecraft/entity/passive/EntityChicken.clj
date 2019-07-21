(ns net.minecraft.entity.passive.EntityChicken
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityChicken]))

(defn ->entity-chicken
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityChicken [^net.minecraft.world.World world-in]
    (new EntityChicken world-in)))

(defn wing-rotation
  "Instance Field.

  type: float"
  (^Float [^EntityChicken this]
    (-> this .-wingRotation)))

(defn dest-pos
  "Instance Field.

  type: float"
  (^Float [^EntityChicken this]
    (-> this .-destPos)))

(defn o-flap-speed
  "Instance Field.

  type: float"
  (^Float [^EntityChicken this]
    (-> this .-oFlapSpeed)))

(defn o-flap
  "Instance Field.

  type: float"
  (^Float [^EntityChicken this]
    (-> this .-oFlap)))

(defn wing-rot-delta
  "Instance Field.

  type: float"
  (^Float [^EntityChicken this]
    (-> this .-wingRotDelta)))

(defn time-until-next-egg
  "Instance Field.

  type: int"
  (^Integer [^EntityChicken this]
    (-> this .-timeUntilNextEgg)))

(defn chicken-jockey
  "Instance Field.

  type: boolean"
  (^Boolean [^EntityChicken this]
    (-> this .-chickenJockey)))

(defn *register-fixes-chicken
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityChicken/registerFixesChicken fixer)))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityChicken this]
    (-> this (.getEyeHeight))))

(defn chicken-jockey?
  "returns: `boolean`"
  (^Boolean [^EntityChicken this]
    (-> this (.isChickenJockey))))

(defn breeding-item?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EntityChicken this ^net.minecraft.item.ItemStack stack]
    (-> this (.isBreedingItem stack))))

(defn create-child
  "ageable - `net.minecraft.entity.EntityAgeable`

  returns: `net.minecraft.entity.passive.EntityChicken`"
  (^net.minecraft.entity.passive.EntityChicken [^EntityChicken this ^net.minecraft.entity.EntityAgeable ageable]
    (-> this (.createChild ageable))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityChicken this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn fall
  "distance - `float`
  damage-multiplier - `float`"
  ([^EntityChicken this ^Float distance ^Float damage-multiplier]
    (-> this (.fall distance damage-multiplier))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityChicken this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn update-passenger
  "passenger - `net.minecraft.entity.Entity`"
  ([^EntityChicken this ^net.minecraft.entity.Entity passenger]
    (-> this (.updatePassenger passenger))))

(defn set-chicken-jockey
  "jockey - `boolean`"
  ([^EntityChicken this ^Boolean jockey]
    (-> this (.setChickenJockey jockey))))

(defn on-living-update
  ""
  ([^EntityChicken this]
    (-> this (.onLivingUpdate))))

