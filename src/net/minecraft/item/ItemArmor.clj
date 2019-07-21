(ns net.minecraft.item.ItemArmor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemArmor]))

(defn ->item-armor
  "Constructor.

  material-in - `net.minecraft.item.ItemArmor$ArmorMaterial`
  render-index-in - `int`
  equipment-slot-in - `net.minecraft.inventory.EntityEquipmentSlot`"
  (^ItemArmor [^net.minecraft.item.ItemArmor$ArmorMaterial material-in ^Integer render-index-in ^net.minecraft.inventory.EntityEquipmentSlot equipment-slot-in]
    (new ItemArmor material-in render-index-in equipment-slot-in)))

(def *-empty-slot-names
  "Static Constant.

  type: java.lang.String[]"
  ItemArmor/EMPTY_SLOT_NAMES)

(def *-dispenser-behavior
  "Static Constant.

  type: net.minecraft.dispenser.IBehaviorDispenseItem"
  ItemArmor/DISPENSER_BEHAVIOR)

(defn armor-type
  "Instance Constant.

  type: net.minecraft.inventory.EntityEquipmentSlot"
  (^net.minecraft.inventory.EntityEquipmentSlot [^ItemArmor this]
    (-> this .-armorType)))

(defn damage-reduce-amount
  "Instance Constant.

  type: int"
  (^Integer [^ItemArmor this]
    (-> this .-damageReduceAmount)))

(defn toughness
  "Instance Constant.

  type: float"
  (^Float [^ItemArmor this]
    (-> this .-toughness)))

(defn render-index
  "Instance Constant.

  type: int"
  (^Integer [^ItemArmor this]
    (-> this .-renderIndex)))

(defn *dispense-armor
  "block-source - `net.minecraft.dispenser.IBlockSource`
  stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^net.minecraft.dispenser.IBlockSource block-source ^net.minecraft.item.ItemStack stack]
    (ItemArmor/dispenseArmor block-source stack)))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemArmor this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

(defn has-color?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemArmor this ^net.minecraft.item.ItemStack stack]
    (-> this (.hasColor stack))))

(defn set-color
  "stack - `net.minecraft.item.ItemStack`
  color - `int`"
  ([^ItemArmor this ^net.minecraft.item.ItemStack stack ^Integer color]
    (-> this (.setColor stack color))))

(defn get-is-repairable?
  "to-repair - `net.minecraft.item.ItemStack`
  repair - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemArmor this ^net.minecraft.item.ItemStack to-repair ^net.minecraft.item.ItemStack repair]
    (-> this (.getIsRepairable to-repair repair))))

(defn remove-color
  "stack - `net.minecraft.item.ItemStack`"
  ([^ItemArmor this ^net.minecraft.item.ItemStack stack]
    (-> this (.removeColor stack))))

(defn get-armor-material
  "returns: `net.minecraft.item.ItemArmor$ArmorMaterial`"
  (^net.minecraft.item.ItemArmor$ArmorMaterial [^ItemArmor this]
    (-> this (.getArmorMaterial))))

(defn get-color
  "stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^ItemArmor this ^net.minecraft.item.ItemStack stack]
    (-> this (.getColor stack))))

(defn has-overlay?
  "Determines if this armor will be rendered with the secondary 'overlay' texture.
   If this is true, the first texture will be rendered using a tint of the color
   specified by getColor(ItemStack)

  stack - The stack - `net.minecraft.item.ItemStack`

  returns: true/false - `boolean`"
  (^Boolean [^ItemArmor this ^net.minecraft.item.ItemStack stack]
    (-> this (.hasOverlay stack))))

(defn get-item-attribute-modifiers
  "equipment-slot - `net.minecraft.inventory.EntityEquipmentSlot`

  returns: `com.google.common.collect.Multimap<java.lang.String,net.minecraft.entity.ai.attributes.AttributeModifier>`"
  (^com.google.common.collect.Multimap [^ItemArmor this ^net.minecraft.inventory.EntityEquipmentSlot equipment-slot]
    (-> this (.getItemAttributeModifiers equipment-slot))))

(defn get-equipment-slot
  "returns: `net.minecraft.inventory.EntityEquipmentSlot`"
  (^net.minecraft.inventory.EntityEquipmentSlot [^ItemArmor this]
    (-> this (.getEquipmentSlot))))

(defn get-item-enchantability
  "returns: `int`"
  (^Integer [^ItemArmor this]
    (-> this (.getItemEnchantability))))

