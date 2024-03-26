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
        Schema::create('dictionaries', function (Blueprint $table) {
            $table->char('id', 32)->comment('ID');

            $table->bigInteger('votes');
            $table->integer('vote');
            $table->mediumInteger('votess');
            $table->smallInteger('votesss');
            $table->tinyInteger('votesssss');
            $table->unsignedBigInteger('vote_num');
            $table->unsignedInteger('vote_nums');
            $table->unsignedMediumInteger('vote_numss');
            $table->unsignedSmallInteger('vote_numsss');
            $table->unsignedTinyInteger('vote_numssss');
            $table->binary('data', 16, true);
            $table->boolean('confirmed');
            $table->char('names', 100);
            $table->dateTime('create', 0);
            $table->dateTimeTz('created', 0);
            $table->time('sunrise',   0);
            $table->timestamp('added_at',  0);
            $table->date('created_on');
            $table->decimal('amount', 8, 2);
            $table->double('amounts');
            $table->float('amounting', 53);
            $table->enum('difficulty', ['easy', 'hard']);
            $table->ipAddress('visitor');
            $table->json('options');
            $table->jsonb('option');
            $table->longText('description');
            $table->longText('datas')->charset('binary');
            $table->mediumText('descriptions');
            $table->tinyText('notes');
            $table->macAddress('device');
            $table->morphs('taggable');
            $table->set('flavors', ['strawberry', 'vanilla']);

            $table->foreignId('user_id');
            $table->geometry('positions', 'point', 0);
            $table->uuidMorphs('taggables');
            $table->uuid('uid');
            $table->year('birth_year');

            $table->string('code', 64)->comment('编码');
            $table->string('name', 255)->comment('名称');
            $table->decimal('number', 12, 4, true)->comment('数值');
            $table->text('content')->comment('内容');
            $table->float('count', 16, 2, false)->comment('总数');

            $table->string('note', 64)->comment('备注');
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
            $table->index(['number', 'note']);

        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('dictionaries');
    }
};
