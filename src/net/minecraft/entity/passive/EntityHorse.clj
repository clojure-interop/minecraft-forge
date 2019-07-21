(ns net.minecraft.entity.passive.EntityHorse
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityHorse]))

(defn ->entity-horse
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityHorse [^net.minecraft.world.World world-in]
    (new EntityHorse world-in)))

(defn *register-fixes-horse
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityHorse/registerFixesHorse fixer)))

(defn get-horse-variant
  "returns: `int`"
  (^Integer [^EntityHorse this]
    (-> this (.getHorseVariant))))

(defn process-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityHorse this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInteract player hand))))

(defn armor?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EntityHorse this ^net.minecraft.item.ItemStack stack]
    (-> this (.isArmor stack))))

(defn on-update
  ""
  ([^EntityHorse this]
    (-> this (.onUpdate))))

(defn create-child
  "ageable - `net.minecraft.entity.EntityAgeable`

  returns: `net.minecraft.entity.EntityAgeable`"
  (^net.minecraft.entity.EntityAgeable [^EntityHorse this ^net.minecraft.entity.EntityAgeable ageable]
    (-> this (.createChild ageable))))

(defn get-variant-texture-paths
  "returns: `java.lang.String[]`"
  ([^EntityHorse this]
    (-> this (.getVariantTexturePaths))))

(defn get-horse-armor-type
  "returns: `net.minecraft.entity.passive.HorseArmorType`"
  (^net.minecraft.entity.passive.HorseArmorType [^EntityHorse this]
    (-> this (.getHorseArmorType))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityHorse this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn set-horse-variant
  "variant - `int`"
  ([^EntityHorse this ^Integer variant]
    (-> this (.setHorseVariant variant))))

(defn get-horse-texture
  "returns: `java.lang.String`"
  (^java.lang.String [^EntityHorse this]
    (-> this (.getHorseTexture))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityHorse this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn on-inventory-changed
  "inv-basic - `net.minecraft.inventory.IInventory`"
  ([^EntityHorse this ^net.minecraft.inventory.IInventory inv-basic]
    (-> this (.onInventoryChanged inv-basic))))

(defn wears-armor
  "returns: `boolean`"
  (^Boolean [^EntityHorse this]
    (-> this (.wearsArmor))))

(defn can-mate-with?
  "other-animal - `net.minecraft.entity.passive.EntityAnimal`

  returns: `boolean`"
  (^Boolean [^EntityHorse this ^net.minecraft.entity.passive.EntityAnimal other-animal]
    (-> this (.canMateWith other-animal))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^EntityHorse this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

(defn set-horse-armor-stack
  "item-stack-in - `net.minecraft.item.ItemStack`"
  ([^EntityHorse this ^net.minecraft.item.ItemStack item-stack-in]
    (-> this (.setHorseArmorStack item-stack-in))))

