(ns net.minecraftforge.common.util.EnumHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.util EnumHelper]))

(defn ->enum-helper
  "Constructor."
  (^EnumHelper []
    (new EnumHelper )))

(defn *test-enum
  "enum-type - `java.lang.Class`
  param-types - `java.lang.Class[]`"
  ([^java.lang.Class enum-type param-types]
    (EnumHelper/testEnum enum-type param-types)))

(defn *add-tool-material
  "name - `java.lang.String`
  harvest-level - `int`
  max-uses - `int`
  efficiency - `float`
  damage - `float`
  enchantability - `int`

  returns: `net.minecraft.item.Item$ToolMaterial`"
  (^net.minecraft.item.Item$ToolMaterial [^java.lang.String name ^Integer harvest-level ^Integer max-uses ^Float efficiency ^Float damage ^Integer enchantability]
    (EnumHelper/addToolMaterial name harvest-level max-uses efficiency damage enchantability)))

(defn *add-art
  "name - `java.lang.String`
  tile - `java.lang.String`
  size-x - `int`
  size-y - `int`
  offset-x - `int`
  offset-y - `int`

  returns: `net.minecraft.entity.item.EntityPainting$EnumArt`"
  (^net.minecraft.entity.item.EntityPainting$EnumArt [^java.lang.String name ^java.lang.String tile ^Integer size-x ^Integer size-y ^Integer offset-x ^Integer offset-y]
    (EnumHelper/addArt name tile size-x size-y offset-x offset-y)))

(defn *add-rarity
  "name - `java.lang.String`
  color - `net.minecraft.util.text.TextFormatting`
  display-name - `java.lang.String`

  returns: `net.minecraft.item.EnumRarity`"
  (^net.minecraft.item.EnumRarity [^java.lang.String name ^net.minecraft.util.text.TextFormatting color ^java.lang.String display-name]
    (EnumHelper/addRarity name color display-name)))

(defn *add-creature-attribute
  "name - `java.lang.String`

  returns: `net.minecraft.entity.EnumCreatureAttribute`"
  (^net.minecraft.entity.EnumCreatureAttribute [^java.lang.String name]
    (EnumHelper/addCreatureAttribute name)))

(defn *add-creature-type
  "name - `java.lang.String`
  type-class - `java.lang.Class`
  max-number - `int`
  material - `net.minecraft.block.material.Material`
  peaceful - `boolean`
  animal - `boolean`

  returns: `net.minecraft.entity.EnumCreatureType`"
  (^net.minecraft.entity.EnumCreatureType [^java.lang.String name ^java.lang.Class type-class ^Integer max-number ^net.minecraft.block.material.Material material ^Boolean peaceful ^Boolean animal]
    (EnumHelper/addCreatureType name type-class max-number material peaceful animal)))

(defn *add-sensitivity
  "name - `java.lang.String`

  returns: `net.minecraft.block.BlockPressurePlate$Sensitivity`"
  (^net.minecraft.block.BlockPressurePlate$Sensitivity [^java.lang.String name]
    (EnumHelper/addSensitivity name)))

(defn *add-action
  "name - `java.lang.String`

  returns: `net.minecraft.item.EnumAction`"
  (^net.minecraft.item.EnumAction [^java.lang.String name]
    (EnumHelper/addAction name)))

(defn *add-sky-block
  "name - `java.lang.String`
  light-value - `int`

  returns: `net.minecraft.world.EnumSkyBlock`"
  (^net.minecraft.world.EnumSkyBlock [^java.lang.String name ^Integer light-value]
    (EnumHelper/addSkyBlock name light-value)))

(defn *add-enchantment-type
  "name - `java.lang.String`
  delegate - `com.google.common.base.Predicate`

  returns: `net.minecraft.enchantment.EnumEnchantmentType`"
  (^net.minecraft.enchantment.EnumEnchantmentType [^java.lang.String name ^com.google.common.base.Predicate delegate]
    (EnumHelper/addEnchantmentType name delegate)))

(defn *add-status
  "name - `java.lang.String`

  returns: `net.minecraft.entity.player.EntityPlayer$SleepResult`"
  (^net.minecraft.entity.player.EntityPlayer$SleepResult [^java.lang.String name]
    (EnumHelper/addStatus name)))

(defn *add-armor-material
  "name - `java.lang.String`
  texture-name - `java.lang.String`
  durability - `int`
  reduction-amounts - `int[]`
  enchantability - `int`
  sound-on-equip - `net.minecraft.util.SoundEvent`
  toughness - `float`

  returns: `net.minecraft.item.ItemArmor$ArmorMaterial`"
  (^net.minecraft.item.ItemArmor$ArmorMaterial [^java.lang.String name ^java.lang.String texture-name ^Integer durability reduction-amounts ^Integer enchantability ^net.minecraft.util.SoundEvent sound-on-equip ^Float toughness]
    (EnumHelper/addArmorMaterial name texture-name durability reduction-amounts enchantability sound-on-equip toughness)))

(defn *set-failsafe-field-value
  "field - `java.lang.reflect.Field`
  target - `java.lang.Object`
  value - `java.lang.Object`

  throws: java.lang.Exception"
  ([^java.lang.reflect.Field field ^java.lang.Object target ^java.lang.Object value]
    (EnumHelper/setFailsafeFieldValue field target value)))

(defn *add-enum
  "enum-type - `java.lang.Class`
  enum-name - `java.lang.String`
  param-types - `java.lang.Class[]`
  param-values - `java.lang.Object`

  returns: `<T extends java.lang.Enum<?>> T`"
  ([^java.lang.Class enum-type ^java.lang.String enum-name param-types ^java.lang.Object param-values]
    (EnumHelper/addEnum enum-type enum-name param-types param-values)))

(defn *add-door
  "name - `java.lang.String`

  returns: `net.minecraft.world.gen.structure.StructureStrongholdPieces$Stronghold$Door`"
  (^net.minecraft.world.gen.structure.StructureStrongholdPieces$Stronghold$Door [^java.lang.String name]
    (EnumHelper/addDoor name)))

(defn *add-moving-object-type
  "name - `java.lang.String`

  returns: `net.minecraft.util.math.RayTraceResult$Type`"
  (^net.minecraft.util.math.RayTraceResult$Type [^java.lang.String name]
    (EnumHelper/addMovingObjectType name)))

