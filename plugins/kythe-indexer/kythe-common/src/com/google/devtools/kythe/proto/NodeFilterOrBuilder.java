// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kythe/proto/explore.proto

package com.google.devtools.kythe.proto;

public interface NodeFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kythe.proto.NodeFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * if set, only return nodes whose languages match any of these strings
   * TODO: consider enabling VName-based filtering for nodes as well as files
   * </pre>
   *
   * <code>repeated string included_languages = 1;</code>
   */
  java.util.List<java.lang.String>
      getIncludedLanguagesList();
  /**
   * <pre>
   * if set, only return nodes whose languages match any of these strings
   * TODO: consider enabling VName-based filtering for nodes as well as files
   * </pre>
   *
   * <code>repeated string included_languages = 1;</code>
   */
  int getIncludedLanguagesCount();
  /**
   * <pre>
   * if set, only return nodes whose languages match any of these strings
   * TODO: consider enabling VName-based filtering for nodes as well as files
   * </pre>
   *
   * <code>repeated string included_languages = 1;</code>
   */
  java.lang.String getIncludedLanguages(int index);
  /**
   * <pre>
   * if set, only return nodes whose languages match any of these strings
   * TODO: consider enabling VName-based filtering for nodes as well as files
   * </pre>
   *
   * <code>repeated string included_languages = 1;</code>
   */
  com.google.protobuf.ByteString
      getIncludedLanguagesBytes(int index);

  /**
   * <pre>
   * if set, only return nodes whose files match any of these VNames
   * Only the parts of the VName that relate to files are relevant here:
   * https://kythe.io/docs/schema/#_vname_conventions
   * TODO: consider also supplying exclusion specs as well as inclusion
   * </pre>
   *
   * <code>repeated .kythe.proto.VName included_files = 2;</code>
   */
  java.util.List<com.google.devtools.kythe.proto.Storage.VName> 
      getIncludedFilesList();
  /**
   * <pre>
   * if set, only return nodes whose files match any of these VNames
   * Only the parts of the VName that relate to files are relevant here:
   * https://kythe.io/docs/schema/#_vname_conventions
   * TODO: consider also supplying exclusion specs as well as inclusion
   * </pre>
   *
   * <code>repeated .kythe.proto.VName included_files = 2;</code>
   */
  com.google.devtools.kythe.proto.Storage.VName getIncludedFiles(int index);
  /**
   * <pre>
   * if set, only return nodes whose files match any of these VNames
   * Only the parts of the VName that relate to files are relevant here:
   * https://kythe.io/docs/schema/#_vname_conventions
   * TODO: consider also supplying exclusion specs as well as inclusion
   * </pre>
   *
   * <code>repeated .kythe.proto.VName included_files = 2;</code>
   */
  int getIncludedFilesCount();
  /**
   * <pre>
   * if set, only return nodes whose files match any of these VNames
   * Only the parts of the VName that relate to files are relevant here:
   * https://kythe.io/docs/schema/#_vname_conventions
   * TODO: consider also supplying exclusion specs as well as inclusion
   * </pre>
   *
   * <code>repeated .kythe.proto.VName included_files = 2;</code>
   */
  java.util.List<? extends com.google.devtools.kythe.proto.Storage.VNameOrBuilder> 
      getIncludedFilesOrBuilderList();
  /**
   * <pre>
   * if set, only return nodes whose files match any of these VNames
   * Only the parts of the VName that relate to files are relevant here:
   * https://kythe.io/docs/schema/#_vname_conventions
   * TODO: consider also supplying exclusion specs as well as inclusion
   * </pre>
   *
   * <code>repeated .kythe.proto.VName included_files = 2;</code>
   */
  com.google.devtools.kythe.proto.Storage.VNameOrBuilder getIncludedFilesOrBuilder(
      int index);
}