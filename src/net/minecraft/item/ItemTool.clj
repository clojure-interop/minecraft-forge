(ns net.minecraft.item.ItemTool
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemTool]))

(defn get-harvest-level
  "Description copied from class: Item

  stack - This item stack instance - `net.minecraft.item.ItemStack`
  tool-class - Tool Class - `java.lang.String`
  player - The player trying to harvest the given blockstate - `net.minecraft.entity.player.EntityPlayer`
  block-state - The block to harvest - `net.minecraft.block.state.IBlockState`

  returns: Harvest level, or -1 if not the specified tool type. - `int`"
  (^Integer [^ItemTool this ^net.minecraft.item.ItemStack stack ^java.lang.String tool-class ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.block.state.IBlockState block-state]
    (-> this (.getHarvestLevel stack tool-class player block-state))))

(defn get-tool-classes
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^ItemTool this ^net.minecraft.item.ItemStack stack]
    (-> this (.getToolClasses stack))))

(defn get-tool-material
  "returns: `net.minecraft.item.Item$ToolMaterial`"
  (^net.minecraft.item.Item$ToolMaterial [^ItemTool this]
    (-> this (.getToolMaterial))))

(defn full-3-d?
  "returns: `boolean`"
  (^Boolean [^ItemTool this]
    (-> this (.isFull3D))))

(defn get-str-vs-block
  "stack - `net.minecraft.item.ItemStack`
  state - `net.minecraft.block.state.IBlockState`

  returns: `float`"
  (^Float [^ItemTool this ^net.minecraft.item.ItemStack stack ^net.minecraft.block.state.IBlockState state]
    (-> this (.getStrVsBlock stack state))))

(defn get-is-repairable?
  "to-repair - `net.minecraft.item.ItemStack`
  repair - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemTool this ^net.minecraft.item.ItemStack to-repair ^net.minecraft.item.ItemStack repair]
    (-> this (.getIsRepairable to-repair repair))))

(defn get-tool-material-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ItemTool this]
    (-> this (.getToolMaterialName))))

(defn hit-entity
  "stack - `net.minecraft.item.ItemStack`
  target - `net.minecraft.entity.EntityLivingBase`
  attacker - `net.minecraft.entity.EntityLivingBase`

  returns: `boolean`"
  (^Boolean [^ItemTool this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.EntityLivingBase target ^net.minecraft.entity.EntityLivingBase attacker]
    (-> this (.hitEntity stack target attacker))))

(defn get-item-attribute-modifiers
  "equipment-slot - `net.minecraft.inventory.EntityEquipmentSlot`

  returns: `com.google.common.collect.Multimap<java.lang.String,net.minecraft.entity.ai.attributes.AttributeModifier>`"
  (^com.google.common.collect.Multimap [^ItemTool this ^net.minecraft.inventory.EntityEquipmentSlot equipment-slot]
    (-> this (.getItemAttributeModifiers equipment-slot))))

(defn on-block-destroyed
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  state - `net.minecraft.block.state.IBlockState`
  pos - `net.minecraft.util.math.BlockPos`
  entity-living - `net.minecraft.entity.EntityLivingBase`

  returns: `boolean`"
  (^Boolean [^ItemTool this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.EntityLivingBase entity-living]
    (-> this (.onBlockDestroyed stack world-in state pos entity-living))))

(defn get-item-enchantability
  "returns: `int`"
  (^Integer [^ItemTool this]
    (-> this (.getItemEnchantability))))

