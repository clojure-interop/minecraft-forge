(ns net.minecraft.entity.passive.EntityAnimal
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityAnimal]))

(defn ->entity-animal
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityAnimal [^net.minecraft.world.World world-in]
    (new EntityAnimal world-in)))

(defn get-talk-interval
  "returns: `int`"
  (^Integer [^EntityAnimal this]
    (-> this (.getTalkInterval))))

(defn process-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityAnimal this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInteract player hand))))

(defn get-player-in-love
  "returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^EntityAnimal this]
    (-> this (.getPlayerInLove))))

(defn breeding-item?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EntityAnimal this ^net.minecraft.item.ItemStack stack]
    (-> this (.isBreedingItem stack))))

(defn get-can-spawn-here?
  "returns: `boolean`"
  (^Boolean [^EntityAnimal this]
    (-> this (.getCanSpawnHere))))

(defn reset-in-love
  ""
  ([^EntityAnimal this]
    (-> this (.resetInLove))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityAnimal this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityAnimal this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityAnimal this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn get-y-offset
  "returns: `double`"
  (^Double [^EntityAnimal this]
    (-> this (.getYOffset))))

(defn can-mate-with?
  "other-animal - `net.minecraft.entity.passive.EntityAnimal`

  returns: `boolean`"
  (^Boolean [^EntityAnimal this ^net.minecraft.entity.passive.EntityAnimal other-animal]
    (-> this (.canMateWith other-animal))))

(defn in-love?
  "returns: `boolean`"
  (^Boolean [^EntityAnimal this]
    (-> this (.isInLove))))

(defn get-block-path-weight
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^EntityAnimal this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBlockPathWeight pos))))

(defn set-in-love
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^EntityAnimal this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.setInLove player))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityAnimal this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn on-living-update
  ""
  ([^EntityAnimal this]
    (-> this (.onLivingUpdate))))

