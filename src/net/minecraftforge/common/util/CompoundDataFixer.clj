(ns net.minecraftforge.common.util.CompoundDataFixer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.util CompoundDataFixer]))

(defn ->compound-data-fixer
  "Constructor.

  vanilla - `net.minecraft.util.datafix.DataFixer`"
  (^CompoundDataFixer [^net.minecraft.util.datafix.DataFixer vanilla]
    (new CompoundDataFixer vanilla)))

(defn process
  "type - `net.minecraft.util.datafix.IFixType`
  nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^CompoundDataFixer this ^net.minecraft.util.datafix.IFixType type ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.process type nbt)))
  (^net.minecraft.nbt.NBTTagCompound [^CompoundDataFixer this ^net.minecraft.util.datafix.IFixType type ^net.minecraft.nbt.NBTTagCompound nbt ^Integer mcversion]
    (-> this (.process type nbt mcversion))))

(defn register-fix
  "Deprecated.

  type - `net.minecraft.util.datafix.IFixType`
  fixable - `net.minecraft.util.datafix.IFixableData`"
  ([^CompoundDataFixer this ^net.minecraft.util.datafix.IFixType type ^net.minecraft.util.datafix.IFixableData fixable]
    (-> this (.registerFix type fixable))))

(defn register-walker
  "Deprecated.

  type - `net.minecraft.util.datafix.FixTypes`
  walker - `net.minecraft.util.datafix.IDataWalker`"
  ([^CompoundDataFixer this ^net.minecraft.util.datafix.FixTypes type ^net.minecraft.util.datafix.IDataWalker walker]
    (-> this (.registerWalker type walker))))

(defn register-vanilla-walker
  "type - `net.minecraft.util.datafix.IFixType`
  walker - `net.minecraft.util.datafix.IDataWalker`"
  ([^CompoundDataFixer this ^net.minecraft.util.datafix.IFixType type ^net.minecraft.util.datafix.IDataWalker walker]
    (-> this (.registerVanillaWalker type walker))))

(defn init
  "Initialize your mod specific data fixer.

  modid - You mod id, must be lower case. - `java.lang.String`
  version - The current data version of your mod - `int`

  returns: `net.minecraftforge.common.util.ModFixs`"
  (^net.minecraftforge.common.util.ModFixs [^CompoundDataFixer this ^java.lang.String modid ^Integer version]
    (-> this (.init modid version))))

(defn write-version-data
  "nbt - `net.minecraft.nbt.NBTTagCompound`"
  ([^CompoundDataFixer this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.writeVersionData nbt))))

