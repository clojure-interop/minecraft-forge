(ns net.minecraft.tileentity.TileEntityEnchantmentTable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityEnchantmentTable]))

(defn ->tile-entity-enchantment-table
  "Constructor."
  (^TileEntityEnchantmentTable []
    (new TileEntityEnchantmentTable )))

(defn tick-count
  "Instance Field.

  type: int"
  (^Integer [^TileEntityEnchantmentTable this]
    (-> this .-tickCount)))

(defn page-flip
  "Instance Field.

  type: float"
  (^Float [^TileEntityEnchantmentTable this]
    (-> this .-pageFlip)))

(defn page-flip-prev
  "Instance Field.

  type: float"
  (^Float [^TileEntityEnchantmentTable this]
    (-> this .-pageFlipPrev)))

(defn flip-t
  "Instance Field.

  type: float"
  (^Float [^TileEntityEnchantmentTable this]
    (-> this .-flipT)))

(defn flip-a
  "Instance Field.

  type: float"
  (^Float [^TileEntityEnchantmentTable this]
    (-> this .-flipA)))

(defn book-spread
  "Instance Field.

  type: float"
  (^Float [^TileEntityEnchantmentTable this]
    (-> this .-bookSpread)))

(defn book-spread-prev
  "Instance Field.

  type: float"
  (^Float [^TileEntityEnchantmentTable this]
    (-> this .-bookSpreadPrev)))

(defn book-rotation
  "Instance Field.

  type: float"
  (^Float [^TileEntityEnchantmentTable this]
    (-> this .-bookRotation)))

(defn book-rotation-prev
  "Instance Field.

  type: float"
  (^Float [^TileEntityEnchantmentTable this]
    (-> this .-bookRotationPrev)))

(defn t-rot
  "Instance Field.

  type: float"
  (^Float [^TileEntityEnchantmentTable this]
    (-> this .-tRot)))

(defn create-container
  "player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.inventory.Container`"
  (^net.minecraft.inventory.Container [^TileEntityEnchantmentTable this ^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.createContainer player-inventory player-in))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityEnchantmentTable this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityEnchantmentTable this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn get-gui-id
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityEnchantmentTable this]
    (-> this (.getGuiID))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^TileEntityEnchantmentTable this]
    (-> this (.getDisplayName))))

(defn update
  ""
  ([^TileEntityEnchantmentTable this]
    (-> this (.update))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityEnchantmentTable this]
    (-> this (.getName))))

(defn set-custom-name
  "custom-name-in - `java.lang.String`"
  ([^TileEntityEnchantmentTable this ^java.lang.String custom-name-in]
    (-> this (.setCustomName custom-name-in))))

(defn has-custom-name?
  "returns: `boolean`"
  (^Boolean [^TileEntityEnchantmentTable this]
    (-> this (.hasCustomName))))

