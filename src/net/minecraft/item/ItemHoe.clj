(ns net.minecraft.item.ItemHoe
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemHoe]))

(defn ->item-hoe
  "Constructor.

  material - `net.minecraft.item.Item$ToolMaterial`"
  (^ItemHoe [^net.minecraft.item.Item$ToolMaterial material]
    (new ItemHoe material)))

(defn on-item-use
  "player - `net.minecraft.entity.player.EntityPlayer`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  hand - `net.minecraft.util.EnumHand`
  facing - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^ItemHoe this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onItemUse player world-in pos hand facing hit-x hit-y hit-z))))

(defn hit-entity
  "stack - `net.minecraft.item.ItemStack`
  target - `net.minecraft.entity.EntityLivingBase`
  attacker - `net.minecraft.entity.EntityLivingBase`

  returns: `boolean`"
  (^Boolean [^ItemHoe this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.EntityLivingBase target ^net.minecraft.entity.EntityLivingBase attacker]
    (-> this (.hitEntity stack target attacker))))

(defn full-3-d?
  "returns: `boolean`"
  (^Boolean [^ItemHoe this]
    (-> this (.isFull3D))))

(defn get-material-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ItemHoe this]
    (-> this (.getMaterialName))))

(defn get-item-attribute-modifiers
  "equipment-slot - `net.minecraft.inventory.EntityEquipmentSlot`

  returns: `com.google.common.collect.Multimap<java.lang.String,net.minecraft.entity.ai.attributes.AttributeModifier>`"
  (^com.google.common.collect.Multimap [^ItemHoe this ^net.minecraft.inventory.EntityEquipmentSlot equipment-slot]
    (-> this (.getItemAttributeModifiers equipment-slot))))

