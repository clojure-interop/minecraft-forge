(ns net.minecraft.entity.passive.EntityWolf
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityWolf]))

(defn ->entity-wolf
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityWolf [^net.minecraft.world.World world-in]
    (new EntityWolf world-in)))

(defn *register-fixes-wolf
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityWolf/registerFixesWolf fixer)))

(defn angry?
  "returns: `boolean`"
  (^Boolean [^EntityWolf this]
    (-> this (.isAngry))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityWolf this]
    (-> this (.getEyeHeight))))

(defn can-be-leashed-to?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^EntityWolf this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.canBeLeashedTo player))))

(defn process-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityWolf this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInteract player hand))))

(defn on-update
  ""
  ([^EntityWolf this]
    (-> this (.onUpdate))))

(defn breeding-item?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EntityWolf this ^net.minecraft.item.ItemStack stack]
    (-> this (.isBreedingItem stack))))

(defn get-collar-color
  "returns: `net.minecraft.item.EnumDyeColor`"
  (^net.minecraft.item.EnumDyeColor [^EntityWolf this]
    (-> this (.getCollarColor))))

(defn create-child
  "ageable - `net.minecraft.entity.EntityAgeable`

  returns: `net.minecraft.entity.passive.EntityWolf`"
  (^net.minecraft.entity.passive.EntityWolf [^EntityWolf this ^net.minecraft.entity.EntityAgeable ageable]
    (-> this (.createChild ageable))))

(defn should-attack-entity?
  "p-142018-1 - `net.minecraft.entity.EntityLivingBase`
  p-142018-2 - `net.minecraft.entity.EntityLivingBase`

  returns: `boolean`"
  (^Boolean [^EntityWolf this ^net.minecraft.entity.EntityLivingBase p-142018-1 ^net.minecraft.entity.EntityLivingBase p-142018-2]
    (-> this (.shouldAttackEntity p-142018-1 p-142018-2))))

(defn set-begging
  "beg - `boolean`"
  ([^EntityWolf this ^Boolean beg]
    (-> this (.setBegging beg))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityWolf this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn wolf-wet?
  "returns: `boolean`"
  (^Boolean [^EntityWolf this]
    (-> this (.isWolfWet))))

(defn set-tamed
  "tamed - `boolean`"
  ([^EntityWolf this ^Boolean tamed]
    (-> this (.setTamed tamed))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityWolf this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn get-shading-while-wet
  "p-70915-1 - `float`

  returns: `float`"
  (^Float [^EntityWolf this ^Float p-70915-1]
    (-> this (.getShadingWhileWet p-70915-1))))

(defn get-tail-rotation
  "returns: `float`"
  (^Float [^EntityWolf this]
    (-> this (.getTailRotation))))

(defn get-vertical-face-speed
  "returns: `int`"
  (^Integer [^EntityWolf this]
    (-> this (.getVerticalFaceSpeed))))

(defn begging?
  "returns: `boolean`"
  (^Boolean [^EntityWolf this]
    (-> this (.isBegging))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityWolf this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn can-mate-with?
  "other-animal - `net.minecraft.entity.passive.EntityAnimal`

  returns: `boolean`"
  (^Boolean [^EntityWolf this ^net.minecraft.entity.passive.EntityAnimal other-animal]
    (-> this (.canMateWith other-animal))))

(defn attack-entity-as-mob
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityWolf this ^net.minecraft.entity.Entity entity-in]
    (-> this (.attackEntityAsMob entity-in))))

(defn set-attack-target
  "entitylivingbase-in - `net.minecraft.entity.EntityLivingBase`"
  ([^EntityWolf this ^net.minecraft.entity.EntityLivingBase entitylivingbase-in]
    (-> this (.setAttackTarget entitylivingbase-in))))

(defn get-shake-angle
  "p-70923-1 - `float`
  p-70923-2 - `float`

  returns: `float`"
  (^Float [^EntityWolf this ^Float p-70923-1 ^Float p-70923-2]
    (-> this (.getShakeAngle p-70923-1 p-70923-2))))

(defn set-collar-color
  "collarcolor - `net.minecraft.item.EnumDyeColor`"
  ([^EntityWolf this ^net.minecraft.item.EnumDyeColor collarcolor]
    (-> this (.setCollarColor collarcolor))))

(defn set-angry
  "angry - `boolean`"
  ([^EntityWolf this ^Boolean angry]
    (-> this (.setAngry angry))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityWolf this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn get-max-spawned-in-chunk
  "returns: `int`"
  (^Integer [^EntityWolf this]
    (-> this (.getMaxSpawnedInChunk))))

(defn on-living-update
  ""
  ([^EntityWolf this]
    (-> this (.onLivingUpdate))))

(defn get-interested-angle
  "p-70917-1 - `float`

  returns: `float`"
  (^Float [^EntityWolf this ^Float p-70917-1]
    (-> this (.getInterestedAngle p-70917-1))))

