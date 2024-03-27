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
        Schema::create('model_fields', function (Blueprint $table) {
            $table->char('id', 32)->comment('ID');

            $table->string('code', 64)->comment('编码');
            $table->string('name', 64)->comment('名称');
            $table->tinyInteger('data_type', false)->comment('数据类型');
            $table->integer('data_length', false)->comment('数据长度');
            $table->string('enum_type', 32)->comment('枚举类型');
            $table->string('model_type', 32)->comment('模型类型');
            $table->boolean('is_slave_model')->nullable(false)->default(false)->comment('是否从模型');
            $table->boolean('is_nullable')->nullable(false)->default(true)->comment('可空');
            $table->boolean('is_searchable')->nullable(false)->default(false)->comment('可搜索');
            $table->boolean('is_hidden')->nullable(false)->default(false)->comment('是否隐藏');
            $table->boolean('is_default_display')->nullable(false)->default(false)->comment('是否默认显示');
            $table->boolean('is_default_hidden')->nullable(false)->default(false)->comment('是否默认隐藏');
            $table->string('note', 255)->comment('备注');
            $table->integer('sequence', false)->comment('顺序');
            $table->string('model', 32)->nullable(false)->comment('模型');

            $table->string('notes', 64)->comment('备注');
            $table->boolean('isSystem', 64)->nullable(false)->default(true)->comment('系统预置');

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
            $table->unique('code');
            $table->index("model");
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('model_fields');
    }
};
