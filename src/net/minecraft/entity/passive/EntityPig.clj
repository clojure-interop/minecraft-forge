(ns net.minecraft.entity.passive.EntityPig
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityPig]))

(defn ->entity-pig
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityPig [^net.minecraft.world.World world-in]
    (new EntityPig world-in)))

(defn *register-fixes-pig
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityPig/registerFixesPig fixer)))

(defn move-entity-with-heading
  "strafe - `float`
  forward - `float`"
  ([^EntityPig this ^Float strafe ^Float forward]
    (-> this (.moveEntityWithHeading strafe forward))))

(defn process-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityPig this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInteract player hand))))

(defn breeding-item?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EntityPig this ^net.minecraft.item.ItemStack stack]
    (-> this (.isBreedingItem stack))))

(defn can-be-steered?
  "returns: `boolean`"
  (^Boolean [^EntityPig this]
    (-> this (.canBeSteered))))

(defn create-child
  "ageable - `net.minecraft.entity.EntityAgeable`

  returns: `net.minecraft.entity.passive.EntityPig`"
  (^net.minecraft.entity.passive.EntityPig [^EntityPig this ^net.minecraft.entity.EntityAgeable ageable]
    (-> this (.createChild ageable))))

(defn boost
  "returns: `boolean`"
  (^Boolean [^EntityPig this]
    (-> this (.boost))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityPig this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn fall
  "distance - `float`
  damage-multiplier - `float`"
  ([^EntityPig this ^Float distance ^Float damage-multiplier]
    (-> this (.fall distance damage-multiplier))))

(defn on-death
  "cause - `net.minecraft.util.DamageSource`"
  ([^EntityPig this ^net.minecraft.util.DamageSource cause]
    (-> this (.onDeath cause))))

(defn get-controlling-passenger
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^EntityPig this]
    (-> this (.getControllingPassenger))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityPig this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn set-saddled
  "saddled - `boolean`"
  ([^EntityPig this ^Boolean saddled]
    (-> this (.setSaddled saddled))))

(defn on-struck-by-lightning
  "lightning-bolt - `net.minecraft.entity.effect.EntityLightningBolt`"
  ([^EntityPig this ^net.minecraft.entity.effect.EntityLightningBolt lightning-bolt]
    (-> this (.onStruckByLightning lightning-bolt))))

(defn notify-data-manager-change
  "key - `net.minecraft.network.datasync.DataParameter`"
  ([^EntityPig this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.notifyDataManagerChange key))))

(defn get-saddled?
  "returns: `boolean`"
  (^Boolean [^EntityPig this]
    (-> this (.getSaddled))))

