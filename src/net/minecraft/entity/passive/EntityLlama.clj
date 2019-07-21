(ns net.minecraft.entity.passive.EntityLlama
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityLlama]))

(defn ->entity-llama
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityLlama [^net.minecraft.world.World world-in]
    (new EntityLlama world-in)))

(defn in-caravan
  "returns: `boolean`"
  (^Boolean [^EntityLlama this]
    (-> this (.inCaravan))))

(defn set-variant
  "variant-in - `int`"
  ([^EntityLlama this ^Integer variant-in]
    (-> this (.setVariant variant-in))))

(defn join-caravan
  "caravan-head-in - `net.minecraft.entity.passive.EntityLlama`"
  ([^EntityLlama this ^net.minecraft.entity.passive.EntityLlama caravan-head-in]
    (-> this (.joinCaravan caravan-head-in))))

(defn armor?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EntityLlama this ^net.minecraft.item.ItemStack stack]
    (-> this (.isArmor stack))))

(defn get-caravan-head
  "returns: `net.minecraft.entity.passive.EntityLlama`"
  (^net.minecraft.entity.passive.EntityLlama [^EntityLlama this]
    (-> this (.getCaravanHead))))

(defn can-be-steered?
  "returns: `boolean`"
  (^Boolean [^EntityLlama this]
    (-> this (.canBeSteered))))

(defn create-child
  "ageable - `net.minecraft.entity.EntityAgeable`

  returns: `net.minecraft.entity.passive.EntityLlama`"
  (^net.minecraft.entity.passive.EntityLlama [^EntityLlama this ^net.minecraft.entity.EntityAgeable ageable]
    (-> this (.createChild ageable))))

(defn get-variant
  "returns: `int`"
  (^Integer [^EntityLlama this]
    (-> this (.getVariant))))

(defn has-color?
  "returns: `boolean`"
  (^Boolean [^EntityLlama this]
    (-> this (.hasColor))))

(defn has-caravan-trail?
  "returns: `boolean`"
  (^Boolean [^EntityLlama this]
    (-> this (.hasCaravanTrail))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityLlama this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn get-max-temper
  "returns: `int`"
  (^Integer [^EntityLlama this]
    (-> this (.getMaxTemper))))

(defn fall
  "distance - `float`
  damage-multiplier - `float`"
  ([^EntityLlama this ^Float distance ^Float damage-multiplier]
    (-> this (.fall distance damage-multiplier))))

(defn can-be-saddled?
  "returns: `boolean`"
  (^Boolean [^EntityLlama this]
    (-> this (.canBeSaddled))))

(defn attack-entity-with-ranged-attack
  "target - `net.minecraft.entity.EntityLivingBase`
  distance-factor - `float`"
  ([^EntityLlama this ^net.minecraft.entity.EntityLivingBase target ^Float distance-factor]
    (-> this (.attackEntityWithRangedAttack target distance-factor))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityLlama this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn update-passenger
  "passenger - `net.minecraft.entity.Entity`"
  ([^EntityLlama this ^net.minecraft.entity.Entity passenger]
    (-> this (.updatePassenger passenger))))

(defn make-mad
  ""
  ([^EntityLlama this]
    (-> this (.makeMad))))

(defn on-inventory-changed
  "inv-basic - `net.minecraft.inventory.IInventory`"
  ([^EntityLlama this ^net.minecraft.inventory.IInventory inv-basic]
    (-> this (.onInventoryChanged inv-basic))))

(defn wears-armor
  "returns: `boolean`"
  (^Boolean [^EntityLlama this]
    (-> this (.wearsArmor))))

(defn get-inventory-columns
  "returns: `int`"
  (^Integer [^EntityLlama this]
    (-> this (.getInventoryColumns))))

(defn can-eat-grass?
  "returns: `boolean`"
  (^Boolean [^EntityLlama this]
    (-> this (.canEatGrass))))

(defn can-mate-with?
  "other-animal - `net.minecraft.entity.passive.EntityAnimal`

  returns: `boolean`"
  (^Boolean [^EntityLlama this ^net.minecraft.entity.passive.EntityAnimal other-animal]
    (-> this (.canMateWith other-animal))))

(defn get-strength
  "returns: `int`"
  (^Integer [^EntityLlama this]
    (-> this (.getStrength))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^EntityLlama this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

(defn get-color
  "returns: `net.minecraft.item.EnumDyeColor`"
  (^net.minecraft.item.EnumDyeColor [^EntityLlama this]
    (-> this (.getColor))))

(defn get-mounted-y-offset
  "returns: `double`"
  (^Double [^EntityLlama this]
    (-> this (.getMountedYOffset))))

(defn leave-caravan
  ""
  ([^EntityLlama this]
    (-> this (.leaveCaravan))))

