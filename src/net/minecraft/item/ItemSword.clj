(ns net.minecraft.item.ItemSword
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemSword]))

(defn ->item-sword
  "Constructor.

  material - `net.minecraft.item.Item$ToolMaterial`"
  (^ItemSword [^net.minecraft.item.Item$ToolMaterial material]
    (new ItemSword material)))

(defn can-harvest-block?
  "block-in - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^ItemSword this ^net.minecraft.block.state.IBlockState block-in]
    (-> this (.canHarvestBlock block-in))))

(defn full-3-d?
  "returns: `boolean`"
  (^Boolean [^ItemSword this]
    (-> this (.isFull3D))))

(defn get-damage-vs-entity
  "returns: `float`"
  (^Float [^ItemSword this]
    (-> this (.getDamageVsEntity))))

(defn get-str-vs-block
  "stack - `net.minecraft.item.ItemStack`
  state - `net.minecraft.block.state.IBlockState`

  returns: `float`"
  (^Float [^ItemSword this ^net.minecraft.item.ItemStack stack ^net.minecraft.block.state.IBlockState state]
    (-> this (.getStrVsBlock stack state))))

(defn get-is-repairable?
  "to-repair - `net.minecraft.item.ItemStack`
  repair - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemSword this ^net.minecraft.item.ItemStack to-repair ^net.minecraft.item.ItemStack repair]
    (-> this (.getIsRepairable to-repair repair))))

(defn get-tool-material-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ItemSword this]
    (-> this (.getToolMaterialName))))

(defn hit-entity
  "stack - `net.minecraft.item.ItemStack`
  target - `net.minecraft.entity.EntityLivingBase`
  attacker - `net.minecraft.entity.EntityLivingBase`

  returns: `boolean`"
  (^Boolean [^ItemSword this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.EntityLivingBase target ^net.minecraft.entity.EntityLivingBase attacker]
    (-> this (.hitEntity stack target attacker))))

(defn get-item-attribute-modifiers
  "equipment-slot - `net.minecraft.inventory.EntityEquipmentSlot`

  returns: `com.google.common.collect.Multimap<java.lang.String,net.minecraft.entity.ai.attributes.AttributeModifier>`"
  (^com.google.common.collect.Multimap [^ItemSword this ^net.minecraft.inventory.EntityEquipmentSlot equipment-slot]
    (-> this (.getItemAttributeModifiers equipment-slot))))

(defn on-block-destroyed
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  state - `net.minecraft.block.state.IBlockState`
  pos - `net.minecraft.util.math.BlockPos`
  entity-living - `net.minecraft.entity.EntityLivingBase`

  returns: `boolean`"
  (^Boolean [^ItemSword this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.EntityLivingBase entity-living]
    (-> this (.onBlockDestroyed stack world-in state pos entity-living))))

(defn get-item-enchantability
  "returns: `int`"
  (^Integer [^ItemSword this]
    (-> this (.getItemEnchantability))))

