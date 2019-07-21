(ns net.minecraft.entity.boss.EntityWither
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss EntityWither]))

(defn ->entity-wither
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityWither [^net.minecraft.world.World world-in]
    (new EntityWither world-in)))

(defn *register-fixes-wither
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityWither/registerFixesWither fixer)))

(defn *can-destroy-block?
  "block-in - `net.minecraft.block.Block`

  returns: `boolean`"
  (^Boolean [^net.minecraft.block.Block block-in]
    (EntityWither/canDestroyBlock block-in)))

(defn non-boss?
  "returns: `boolean`"
  (^Boolean [^EntityWither this]
    (-> this (.isNonBoss))))

(defn set-custom-name-tag
  "name - `java.lang.String`"
  ([^EntityWither this ^java.lang.String name]
    (-> this (.setCustomNameTag name))))

(defn set-invul-time
  "time - `int`"
  ([^EntityWither this ^Integer time]
    (-> this (.setInvulTime time))))

(defn get-invul-time
  "returns: `int`"
  (^Integer [^EntityWither this]
    (-> this (.getInvulTime))))

(defn add-potion-effect
  "potioneffect-in - `net.minecraft.potion.PotionEffect`"
  ([^EntityWither this ^net.minecraft.potion.PotionEffect potioneffect-in]
    (-> this (.addPotionEffect potioneffect-in))))

(defn update-watched-target-id
  "target-offset - `int`
  new-id - `int`"
  ([^EntityWither this ^Integer target-offset ^Integer new-id]
    (-> this (.updateWatchedTargetId target-offset new-id))))

(defn remove-tracking-player
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^EntityWither this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.removeTrackingPlayer player))))

(defn get-head-x-rotation
  "p-82210-1 - `int`

  returns: `float`"
  (^Float [^EntityWither this ^Integer p-82210-1]
    (-> this (.getHeadXRotation p-82210-1))))

(defn set-in-web
  ""
  ([^EntityWither this]
    (-> this (.setInWeb))))

(defn get-watched-target-id
  "head - `int`

  returns: `int`"
  (^Integer [^EntityWither this ^Integer head]
    (-> this (.getWatchedTargetId head))))

(defn get-brightness-for-render
  "partial-ticks - `float`

  returns: `int`"
  (^Integer [^EntityWither this ^Float partial-ticks]
    (-> this (.getBrightnessForRender partial-ticks))))

(defn get-head-y-rotation
  "p-82207-1 - `int`

  returns: `float`"
  (^Float [^EntityWither this ^Integer p-82207-1]
    (-> this (.getHeadYRotation p-82207-1))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityWither this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn get-creature-attribute
  "returns: `net.minecraft.entity.EnumCreatureAttribute`"
  (^net.minecraft.entity.EnumCreatureAttribute [^EntityWither this]
    (-> this (.getCreatureAttribute))))

(defn fall
  "distance - `float`
  damage-multiplier - `float`"
  ([^EntityWither this ^Float distance ^Float damage-multiplier]
    (-> this (.fall distance damage-multiplier))))

(defn attack-entity-with-ranged-attack
  "target - `net.minecraft.entity.EntityLivingBase`
  distance-factor - `float`"
  ([^EntityWither this ^net.minecraft.entity.EntityLivingBase target ^Float distance-factor]
    (-> this (.attackEntityWithRangedAttack target distance-factor))))

(defn armored?
  "returns: `boolean`"
  (^Boolean [^EntityWither this]
    (-> this (.isArmored))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityWither this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityWither this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn add-tracking-player
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^EntityWither this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.addTrackingPlayer player))))

(defn ignite
  ""
  ([^EntityWither this]
    (-> this (.ignite))))

(defn on-living-update
  ""
  ([^EntityWither this]
    (-> this (.onLivingUpdate))))

