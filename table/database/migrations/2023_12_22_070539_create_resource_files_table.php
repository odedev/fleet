<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        Schema::create('resource_files', function (Blueprint $table) {
            $table->char('id', 32)->comment('ID');
            $table->string('name', 255)->nullable(false)->default('')->comment('文件名');

            $table->bigInteger('size', false, true)->comment('文件大小');
            $table->string('type', 255)->comment('文件类型');
            $table->string('path', 255)->nullable(false)->default('')->comment('文件路径');
            $table->string('url', 255)->nullable(false)->default('')->comment('文件URL');
            $table->tinyInteger('location', false, false)->comment('存储位置');
            $table->string('directory', 255)->comment('目录');
            $table->string('category', 255)->comment('分类');
            $table->string('status', 255)->comment('状态');
            $table->string('scope', 255)->comment('域');

            $table->string('remark', 255)->nullable(true)->default('')->comment('备注');
            $table->boolean('is_valid')->nullable(false)->default(true)->comment('是否有效');
            $table->char('created_by', 32)->nullable(false)->comment('创建人ID');
            $table->dateTime('created_at', $precision = 0)->useCurrent()->comment('创建时间');
            $table->char('updated_by', 32)->nullable(true)->default(null)->comment('更新人ID');
            $table->dateTime('updated_at', $precision = 0)->nullable(true)->default(null)->useCurrentOnUpdate()->comment('更新时间');
            $table->unsignedInteger('updated_count')->nullable(true)->default(0)->comment('更新总次数');
            $table->char('deleted_by', 32)->nullable(true)->default(null)->comment('删除人ID');
            $table->dateTime('deleted_at', $precision = 0)->nullable(true)->default(null)->comment('删除时间');

            $table->primary('id');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('resource_files');
    }
};
