(ns net.minecraftforge.common.EnumPlantType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common EnumPlantType]))

(def Plains
  "Enum Constant.

  type: net.minecraftforge.common.EnumPlantType"
  EnumPlantType/Plains)

(def Desert
  "Enum Constant.

  type: net.minecraftforge.common.EnumPlantType"
  EnumPlantType/Desert)

(def Beach
  "Enum Constant.

  type: net.minecraftforge.common.EnumPlantType"
  EnumPlantType/Beach)

(def Cave
  "Enum Constant.

  type: net.minecraftforge.common.EnumPlantType"
  EnumPlantType/Cave)

(def Water
  "Enum Constant.

  type: net.minecraftforge.common.EnumPlantType"
  EnumPlantType/Water)

(def Nether
  "Enum Constant.

  type: net.minecraftforge.common.EnumPlantType"
  EnumPlantType/Nether)

(def Crop
  "Enum Constant.

  type: net.minecraftforge.common.EnumPlantType"
  EnumPlantType/Crop)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumPlantType c : EnumPlantType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.common.EnumPlantType[]`"
  ([]
    (EnumPlantType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.common.EnumPlantType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.common.EnumPlantType [^java.lang.String name]
    (EnumPlantType/valueOf name)))

(defn *get-plant-type
  "Getting a custom EnumPlantType, or an existing one if it has the same name as that one. Your plant should implement IPlantable
   and return this custom type in IPlantable.getPlantType(IBlockAccess, BlockPos).

   If your new plant grows on blocks like any one of them above, never create a new EnumPlantType.
   This enumeration is only functioning in
   Block.canSustainPlant(IBlockState, IBlockAccess, BlockPos, EnumFacing, IPlantable),
   which you are supposed to override this function in your new block and create a new plant type to grow on that block.

   You can create an instance of your plant type in your API and let your/others mods access it. It will be faster than calling this method.

  name - the name of the type of plant, you had better follow the style above - `java.lang.String`

  returns: the acquired EnumPlantType, a new one if not found. - `net.minecraftforge.common.EnumPlantType`"
  (^net.minecraftforge.common.EnumPlantType [^java.lang.String name]
    (EnumPlantType/getPlantType name)))

