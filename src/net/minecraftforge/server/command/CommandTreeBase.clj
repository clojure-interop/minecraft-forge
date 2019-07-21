(ns net.minecraftforge.server.command.CommandTreeBase
  "Base class for commands that has subcommands.

  E.g. /team settings set [value]
  settings is subcommand of team and set is subcommand of settings"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.command CommandTreeBase]))

(defn ->command-tree-base
  "Constructor."
  (^CommandTreeBase []
    (new CommandTreeBase )))

(defn add-subcommand
  "c - `net.minecraft.command.ICommand`"
  ([^CommandTreeBase this ^net.minecraft.command.ICommand c]
    (-> this (.addSubcommand c))))

(defn get-sub-commands
  "returns: `java.util.Collection<net.minecraft.command.ICommand>`"
  (^java.util.Collection [^CommandTreeBase this]
    (-> this (.getSubCommands))))

(defn get-command-map
  "returns: `java.util.Map<java.lang.String,net.minecraft.command.ICommand>`"
  (^java.util.Map [^CommandTreeBase this]
    (-> this (.getCommandMap))))

(defn get-sorted-command-list
  "returns: `java.util.List<net.minecraft.command.ICommand>`"
  (^java.util.List [^CommandTreeBase this]
    (-> this (.getSortedCommandList))))

(defn get-tab-completions
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CommandTreeBase this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getTabCompletions server sender args pos))))

(defn username-index?
  "args - `java.lang.String[]`
  index - `int`

  returns: `boolean`"
  (^Boolean [^CommandTreeBase this args ^Integer index]
    (-> this (.isUsernameIndex args index))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandTreeBase this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

