(ns net.minecraft.inventory.Slot
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory Slot]))

(defn ->slot
  "Constructor.

  inventory-in - `net.minecraft.inventory.IInventory`
  index - `int`
  x-position - `int`
  y-position - `int`"
  (^Slot [^net.minecraft.inventory.IInventory inventory-in ^Integer index ^Integer x-position ^Integer y-position]
    (new Slot inventory-in index x-position y-position)))

(defn inventory
  "Instance Constant.

  type: net.minecraft.inventory.IInventory"
  (^net.minecraft.inventory.IInventory [^Slot this]
    (-> this .-inventory)))

(defn slot-number
  "Instance Field.

  type: int"
  (^Integer [^Slot this]
    (-> this .-slotNumber)))

(defn x-pos
  "Instance Field.

  type: int"
  (^Integer [^Slot this]
    (-> this .-xPos)))

(defn y-pos
  "Instance Field.

  type: int"
  (^Integer [^Slot this]
    (-> this .-yPos)))

(defn get-item-stack-limit
  "stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^Slot this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemStackLimit stack))))

(defn put-stack
  "stack - `net.minecraft.item.ItemStack`"
  ([^Slot this ^net.minecraft.item.ItemStack stack]
    (-> this (.putStack stack))))

(defn get-slot-texture
  "returns: `java.lang.String`"
  (^java.lang.String [^Slot this]
    (-> this (.getSlotTexture))))

(defn decr-stack-size
  "amount - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^Slot this ^Integer amount]
    (-> this (.decrStackSize amount))))

(defn get-has-stack?
  "returns: `boolean`"
  (^Boolean [^Slot this]
    (-> this (.getHasStack))))

(defn item-valid?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^Slot this ^net.minecraft.item.ItemStack stack]
    (-> this (.isItemValid stack))))

(defn get-background-sprite
  "returns: `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  (^net.minecraft.client.renderer.texture.TextureAtlasSprite [^Slot this]
    (-> this (.getBackgroundSprite))))

(defn get-background-location
  "Gets the path of the texture file to use for the background image of this slot when drawing the GUI.

  returns: The resource location for the background image - `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^Slot this]
    (-> this (.getBackgroundLocation))))

(defn can-be-hovered?
  "returns: `boolean`"
  (^Boolean [^Slot this]
    (-> this (.canBeHovered))))

(defn on-slot-change
  "p-75220-1 - `net.minecraft.item.ItemStack`
  p-75220-2 - `net.minecraft.item.ItemStack`"
  ([^Slot this ^net.minecraft.item.ItemStack p-75220-1 ^net.minecraft.item.ItemStack p-75220-2]
    (-> this (.onSlotChange p-75220-1 p-75220-2))))

(defn same-inventory?
  "Checks if the other slot is in the same inventory, by comparing the inventory reference.

  other - `net.minecraft.inventory.Slot`

  returns: true if the other slot is in the same inventory - `boolean`"
  (^Boolean [^Slot this ^net.minecraft.inventory.Slot other]
    (-> this (.isSameInventory other))))

(defn get-stack
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^Slot this]
    (-> this (.getStack))))

(defn set-background-location
  "Sets the texture file to use for the background image of the slot when it's empty.

  texture - the resourcelocation for the texture - `net.minecraft.util.ResourceLocation`"
  ([^Slot this ^net.minecraft.util.ResourceLocation texture]
    (-> this (.setBackgroundLocation texture))))

(defn here?
  "inv - `net.minecraft.inventory.IInventory`
  slot-in - `int`

  returns: `boolean`"
  (^Boolean [^Slot this ^net.minecraft.inventory.IInventory inv ^Integer slot-in]
    (-> this (.isHere inv slot-in))))

(defn can-take-stack?
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^Slot this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.canTakeStack player-in))))

(defn on-take
  "the-player - `net.minecraft.entity.player.EntityPlayer`
  stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^Slot this ^net.minecraft.entity.player.EntityPlayer the-player ^net.minecraft.item.ItemStack stack]
    (-> this (.onTake the-player stack))))

(defn get-slot-stack-limit
  "returns: `int`"
  (^Integer [^Slot this]
    (-> this (.getSlotStackLimit))))

(defn set-background-name
  "Sets which icon index to use as the background image of the slot when it's empty.

  name - The icon to use, null for none - `java.lang.String`"
  ([^Slot this ^java.lang.String name]
    (-> this (.setBackgroundName name))))

(defn on-slot-changed
  ""
  ([^Slot this]
    (-> this (.onSlotChanged))))

(defn get-slot-index
  "Retrieves the index in the inventory for this slot, this value should typically not
   be used, but can be useful for some occasions.

  returns: Index in associated inventory for this slot. - `int`"
  (^Integer [^Slot this]
    (-> this (.getSlotIndex))))

