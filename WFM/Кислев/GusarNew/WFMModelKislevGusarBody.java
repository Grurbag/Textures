// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelKislevGusarBody extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer bone;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Body_r2;
	private final ModelRenderer Body_r3;
	private final ModelRenderer Body_r4;
	private final ModelRenderer Body_r5;
	private final ModelRenderer Body_r6;
	private final ModelRenderer Body_r7;
	private final ModelRenderer Body_r8;
	private final ModelRenderer Body_r9;
	private final ModelRenderer Body_r10;
	private final ModelRenderer Body_r11;
	private final ModelRenderer Body_r12;
	private final ModelRenderer Body_r13;
	private final ModelRenderer Body_r14;
	private final ModelRenderer Body_r15;
	private final ModelRenderer Body_r16;
	private final ModelRenderer Body_r17;
	private final ModelRenderer Body_r18;
	private final ModelRenderer Body_r19;
	private final ModelRenderer Body_r20;
	private final ModelRenderer bone2;
	private final ModelRenderer Body_r21;
	private final ModelRenderer Body_r22;
	private final ModelRenderer Body_r23;
	private final ModelRenderer Body_r24;
	private final ModelRenderer Body_r25;
	private final ModelRenderer Body_r26;
	private final ModelRenderer Body_r27;
	private final ModelRenderer Body_r28;
	private final ModelRenderer Body_r29;
	private final ModelRenderer Body_r30;
	private final ModelRenderer Body_r31;
	private final ModelRenderer Body_r32;
	private final ModelRenderer Body_r33;
	private final ModelRenderer Body_r34;
	private final ModelRenderer Body_r35;
	private final ModelRenderer Body_r36;
	private final ModelRenderer Body_r37;
	private final ModelRenderer Body_r38;
	private final ModelRenderer Body_r39;
	private final ModelRenderer Body_r40;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm_r2;
	private final ModelRenderer RightArm_r3;

	public WFMModelKislevGusarBody() {
		texWidth = 64;
		texHeight = 64;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		Body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);

		bone = new ModelRenderer(this);
		bone.setPos(3.5F, 4.9687F, 2.4352F);
		Body.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.7418F, 0.0F);
		

		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(0.0F, -23.0F, 2.0F);
		bone.addChild(Body_r1);
		setRotationAngle(Body_r1, -0.4363F, 0.0F, 0.0F);
		Body_r1.texOffs(8, 56).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);

		Body_r2 = new ModelRenderer(this);
		Body_r2.setPos(0.0F, -18.2203F, 6.5419F);
		bone.addChild(Body_r2);
		setRotationAngle(Body_r2, -1.1781F, 0.0F, 0.0F);
		Body_r2.texOffs(5, 53).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 9.0F, 0.02F, false);

		Body_r3 = new ModelRenderer(this);
		Body_r3.setPos(0.0F, -7.8609F, 5.9505F);
		bone.addChild(Body_r3);
		setRotationAngle(Body_r3, -1.9199F, 0.0F, 0.0F);
		Body_r3.texOffs(0, 48).addBox(-0.5F, -1.0F, -7.0F, 1.0F, 2.0F, 14.0F, 0.05F, false);

		Body_r4 = new ModelRenderer(this);
		Body_r4.setPos(0.0F, -0.5657F, 1.8005F);
		bone.addChild(Body_r4);
		setRotationAngle(Body_r4, -2.6616F, 0.0F, 0.0F);
		Body_r4.texOffs(0, 55).addBox(-0.5F, -1.0F, -2.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);

		Body_r5 = new ModelRenderer(this);
		Body_r5.setPos(-0.5F, 2.3392F, 4.9434F);
		bone.addChild(Body_r5);
		setRotationAngle(Body_r5, -2.7489F, 0.0F, 0.0F);
		Body_r5.texOffs(60, 54).addBox(0.0F, -3.6F, 2.1F, 0.0F, 8.0F, 2.0F, 0.0F, false);

		Body_r6 = new ModelRenderer(this);
		Body_r6.setPos(-0.5F, 2.3392F, 4.9434F);
		bone.addChild(Body_r6);
		setRotationAngle(Body_r6, -2.5307F, 0.0F, 0.0F);
		Body_r6.texOffs(60, 54).addBox(0.0F, -3.5F, -0.5F, 0.0F, 8.0F, 2.0F, 0.0F, false);

		Body_r7 = new ModelRenderer(this);
		Body_r7.setPos(-0.5F, 0.528F, 6.9854F);
		bone.addChild(Body_r7);
		setRotationAngle(Body_r7, -2.2689F, 0.0F, 0.0F);
		Body_r7.texOffs(60, 54).addBox(0.0F, -3.6F, -0.7F, 0.0F, 8.0F, 2.0F, 0.0F, false);

		Body_r8 = new ModelRenderer(this);
		Body_r8.setPos(-0.5F, -1.4505F, 8.3586F);
		bone.addChild(Body_r8);
		setRotationAngle(Body_r8, -2.0944F, 0.0F, 0.0F);
		Body_r8.texOffs(60, 54).addBox(0.0F, -3.8F, -1.0F, 0.0F, 8.0F, 2.0F, 0.0F, false);

		Body_r9 = new ModelRenderer(this);
		Body_r9.setPos(-0.5F, -3.7707F, 9.7715F);
		bone.addChild(Body_r9);
		setRotationAngle(Body_r9, -2.0071F, 0.0F, 0.0F);
		Body_r9.texOffs(60, 54).addBox(0.0F, -3.7F, -0.8F, 0.0F, 8.0F, 2.0F, 0.0F, false);

		Body_r10 = new ModelRenderer(this);
		Body_r10.setPos(-0.5F, -6.026F, 10.5924F);
		bone.addChild(Body_r10);
		setRotationAngle(Body_r10, -1.9199F, 0.0F, 0.0F);
		Body_r10.texOffs(60, 54).addBox(0.0F, -4.1F, -1.0F, 0.0F, 8.0F, 2.0F, 0.0F, false);

		Body_r11 = new ModelRenderer(this);
		Body_r11.setPos(-0.5F, -11.1574F, 12.692F);
		bone.addChild(Body_r11);
		setRotationAngle(Body_r11, -1.8326F, 0.0F, 0.0F);
		Body_r11.texOffs(56, 54).addBox(0.0F, -3.4F, 1.9F, 0.0F, 8.0F, 2.0F, 0.0F, false);

		Body_r12 = new ModelRenderer(this);
		Body_r12.setPos(-0.5F, -11.1574F, 12.692F);
		bone.addChild(Body_r12);
		setRotationAngle(Body_r12, -1.6581F, 0.0F, 0.0F);
		Body_r12.texOffs(56, 54).addBox(0.0F, -3.3F, -1.0F, 0.0F, 8.0F, 2.0F, 0.0F, false);

		Body_r13 = new ModelRenderer(this);
		Body_r13.setPos(-0.5F, -16.2467F, 12.3472F);
		bone.addChild(Body_r13);
		setRotationAngle(Body_r13, -1.4835F, 0.0F, 0.0F);
		Body_r13.texOffs(56, 54).addBox(0.0F, -3.9F, 1.1F, 0.0F, 8.0F, 2.0F, 0.0F, false);

		Body_r14 = new ModelRenderer(this);
		Body_r14.setPos(-0.5F, -16.2467F, 12.3472F);
		bone.addChild(Body_r14);
		setRotationAngle(Body_r14, -1.309F, 0.0F, 0.0F);
		Body_r14.texOffs(56, 54).addBox(0.0F, -4.1F, -1.5F, 0.0F, 8.0F, 2.0F, 0.0F, false);

		Body_r15 = new ModelRenderer(this);
		Body_r15.setPos(-0.5F, -19.1F, 11.4151F);
		bone.addChild(Body_r15);
		setRotationAngle(Body_r15, -1.2217F, 0.0F, 0.0F);
		Body_r15.texOffs(56, 54).addBox(0.0F, -4.1F, -1.0F, 0.0F, 8.0F, 2.0F, 0.0F, false);

		Body_r16 = new ModelRenderer(this);
		Body_r16.setPos(-0.5F, -21.7466F, 9.5189F);
		bone.addChild(Body_r16);
		setRotationAngle(Body_r16, -1.0908F, 0.0F, 0.0F);
		Body_r16.texOffs(56, 54).addBox(0.0F, -4.7F, -0.4F, 0.0F, 8.0F, 2.0F, 0.0F, false);

		Body_r17 = new ModelRenderer(this);
		Body_r17.setPos(0.0F, -23.0F, 2.0F);
		bone.addChild(Body_r17);
		setRotationAngle(Body_r17, -0.1309F, 0.0F, 0.0F);
		Body_r17.texOffs(52, 52).addBox(-0.5F, -10.3F, -2.0F, 0.0F, 10.0F, 2.0F, 0.0F, false);

		Body_r18 = new ModelRenderer(this);
		Body_r18.setPos(0.0F, -23.0F, 2.0F);
		bone.addChild(Body_r18);
		setRotationAngle(Body_r18, -0.2618F, 0.0F, 0.0F);
		Body_r18.texOffs(52, 52).addBox(-0.5F, -10.6F, -0.3F, 0.0F, 10.0F, 2.0F, 0.0F, false);

		Body_r19 = new ModelRenderer(this);
		Body_r19.setPos(-0.5F, -26.2166F, 6.2548F);
		bone.addChild(Body_r19);
		setRotationAngle(Body_r19, -0.48F, 0.0F, 0.0F);
		Body_r19.texOffs(52, 52).addBox(0.0F, -5.5F, -0.7F, 0.0F, 10.0F, 2.0F, 0.0F, false);

		Body_r20 = new ModelRenderer(this);
		Body_r20.setPos(-0.5F, -24.2114F, 8.671F);
		bone.addChild(Body_r20);
		setRotationAngle(Body_r20, -0.829F, 0.0F, 0.0F);
		Body_r20.texOffs(52, 52).addBox(0.0F, -5.0F, -0.8F, 0.0F, 10.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(-3.5F, 4.9687F, 2.4352F);
		Body.addChild(bone2);
		setRotationAngle(bone2, 0.0F, -0.7418F, 0.0F);
		

		Body_r21 = new ModelRenderer(this);
		Body_r21.setPos(0.0F, -23.0F, 2.0F);
		bone2.addChild(Body_r21);
		setRotationAngle(Body_r21, -0.4363F, 0.0F, 0.0F);
		Body_r21.texOffs(8, 56).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 6.0F, 0.0F, true);

		Body_r22 = new ModelRenderer(this);
		Body_r22.setPos(0.0F, -18.2203F, 6.5419F);
		bone2.addChild(Body_r22);
		setRotationAngle(Body_r22, -1.1781F, 0.0F, 0.0F);
		Body_r22.texOffs(5, 53).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 9.0F, 0.02F, true);

		Body_r23 = new ModelRenderer(this);
		Body_r23.setPos(0.0F, -7.8609F, 5.9505F);
		bone2.addChild(Body_r23);
		setRotationAngle(Body_r23, -1.9199F, 0.0F, 0.0F);
		Body_r23.texOffs(0, 48).addBox(-0.5F, -1.0F, -7.0F, 1.0F, 2.0F, 14.0F, 0.05F, true);

		Body_r24 = new ModelRenderer(this);
		Body_r24.setPos(0.0F, -0.5657F, 1.8005F);
		bone2.addChild(Body_r24);
		setRotationAngle(Body_r24, -2.6616F, 0.0F, 0.0F);
		Body_r24.texOffs(0, 55).addBox(-0.5F, -1.0F, -2.5F, 1.0F, 2.0F, 5.0F, 0.0F, true);

		Body_r25 = new ModelRenderer(this);
		Body_r25.setPos(0.5F, 2.3392F, 4.9434F);
		bone2.addChild(Body_r25);
		setRotationAngle(Body_r25, -2.7489F, 0.0F, 0.0F);
		Body_r25.texOffs(60, 54).addBox(0.0F, -3.6F, 2.1F, 0.0F, 8.0F, 2.0F, 0.0F, true);

		Body_r26 = new ModelRenderer(this);
		Body_r26.setPos(0.5F, 2.3392F, 4.9434F);
		bone2.addChild(Body_r26);
		setRotationAngle(Body_r26, -2.5307F, 0.0F, 0.0F);
		Body_r26.texOffs(60, 54).addBox(0.0F, -3.5F, -0.5F, 0.0F, 8.0F, 2.0F, 0.0F, true);

		Body_r27 = new ModelRenderer(this);
		Body_r27.setPos(0.5F, 0.528F, 6.9854F);
		bone2.addChild(Body_r27);
		setRotationAngle(Body_r27, -2.2689F, 0.0F, 0.0F);
		Body_r27.texOffs(60, 54).addBox(0.0F, -3.6F, -0.7F, 0.0F, 8.0F, 2.0F, 0.0F, true);

		Body_r28 = new ModelRenderer(this);
		Body_r28.setPos(0.5F, -1.4505F, 8.3586F);
		bone2.addChild(Body_r28);
		setRotationAngle(Body_r28, -2.0944F, 0.0F, 0.0F);
		Body_r28.texOffs(60, 54).addBox(0.0F, -3.8F, -1.0F, 0.0F, 8.0F, 2.0F, 0.0F, true);

		Body_r29 = new ModelRenderer(this);
		Body_r29.setPos(0.5F, -3.7707F, 9.7715F);
		bone2.addChild(Body_r29);
		setRotationAngle(Body_r29, -2.0071F, 0.0F, 0.0F);
		Body_r29.texOffs(60, 54).addBox(0.0F, -3.7F, -0.8F, 0.0F, 8.0F, 2.0F, 0.0F, true);

		Body_r30 = new ModelRenderer(this);
		Body_r30.setPos(0.5F, -6.026F, 10.5924F);
		bone2.addChild(Body_r30);
		setRotationAngle(Body_r30, -1.9199F, 0.0F, 0.0F);
		Body_r30.texOffs(60, 54).addBox(0.0F, -4.1F, -1.0F, 0.0F, 8.0F, 2.0F, 0.0F, true);

		Body_r31 = new ModelRenderer(this);
		Body_r31.setPos(0.5F, -11.1574F, 12.692F);
		bone2.addChild(Body_r31);
		setRotationAngle(Body_r31, -1.8326F, 0.0F, 0.0F);
		Body_r31.texOffs(56, 54).addBox(0.0F, -3.4F, 1.9F, 0.0F, 8.0F, 2.0F, 0.0F, true);

		Body_r32 = new ModelRenderer(this);
		Body_r32.setPos(0.5F, -11.1574F, 12.692F);
		bone2.addChild(Body_r32);
		setRotationAngle(Body_r32, -1.6581F, 0.0F, 0.0F);
		Body_r32.texOffs(56, 54).addBox(0.0F, -3.3F, -1.0F, 0.0F, 8.0F, 2.0F, 0.0F, true);

		Body_r33 = new ModelRenderer(this);
		Body_r33.setPos(0.5F, -16.2467F, 12.3472F);
		bone2.addChild(Body_r33);
		setRotationAngle(Body_r33, -1.4835F, 0.0F, 0.0F);
		Body_r33.texOffs(56, 54).addBox(0.0F, -3.9F, 1.1F, 0.0F, 8.0F, 2.0F, 0.0F, true);

		Body_r34 = new ModelRenderer(this);
		Body_r34.setPos(0.5F, -16.2467F, 12.3472F);
		bone2.addChild(Body_r34);
		setRotationAngle(Body_r34, -1.309F, 0.0F, 0.0F);
		Body_r34.texOffs(56, 54).addBox(0.0F, -4.1F, -1.5F, 0.0F, 8.0F, 2.0F, 0.0F, true);

		Body_r35 = new ModelRenderer(this);
		Body_r35.setPos(0.5F, -19.1F, 11.4151F);
		bone2.addChild(Body_r35);
		setRotationAngle(Body_r35, -1.2217F, 0.0F, 0.0F);
		Body_r35.texOffs(56, 54).addBox(0.0F, -4.1F, -1.0F, 0.0F, 8.0F, 2.0F, 0.0F, true);

		Body_r36 = new ModelRenderer(this);
		Body_r36.setPos(0.5F, -21.7466F, 9.5189F);
		bone2.addChild(Body_r36);
		setRotationAngle(Body_r36, -1.0908F, 0.0F, 0.0F);
		Body_r36.texOffs(56, 54).addBox(0.0F, -4.7F, -0.4F, 0.0F, 8.0F, 2.0F, 0.0F, true);

		Body_r37 = new ModelRenderer(this);
		Body_r37.setPos(0.0F, -23.0F, 2.0F);
		bone2.addChild(Body_r37);
		setRotationAngle(Body_r37, -0.1309F, 0.0F, 0.0F);
		Body_r37.texOffs(52, 52).addBox(0.5F, -10.3F, -2.0F, 0.0F, 10.0F, 2.0F, 0.0F, true);

		Body_r38 = new ModelRenderer(this);
		Body_r38.setPos(0.0F, -23.0F, 2.0F);
		bone2.addChild(Body_r38);
		setRotationAngle(Body_r38, -0.2618F, 0.0F, 0.0F);
		Body_r38.texOffs(52, 52).addBox(0.5F, -10.6F, -0.3F, 0.0F, 10.0F, 2.0F, 0.0F, true);

		Body_r39 = new ModelRenderer(this);
		Body_r39.setPos(0.5F, -26.2166F, 6.2548F);
		bone2.addChild(Body_r39);
		setRotationAngle(Body_r39, -0.48F, 0.0F, 0.0F);
		Body_r39.texOffs(52, 52).addBox(0.0F, -5.5F, -0.7F, 0.0F, 10.0F, 2.0F, 0.0F, true);

		Body_r40 = new ModelRenderer(this);
		Body_r40.setPos(0.5F, -24.2114F, 8.671F);
		bone2.addChild(Body_r40);
		setRotationAngle(Body_r40, -0.829F, 0.0F, 0.0F);
		Body_r40.texOffs(52, 52).addBox(0.0F, -5.0F, -0.8F, 0.0F, 10.0F, 2.0F, 0.0F, true);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		RightArm.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		RightArm.texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setPos(-1.0F, -0.5F, 0.0F);
		RightArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, -0.1309F);
		RightArm_r1.texOffs(40, 2).addBox(-3.25F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, -0.15F, true);
		RightArm_r1.texOffs(16, 43).addBox(-3.25F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.3F, true);
		RightArm_r1.texOffs(16, 32).addBox(-3.25F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.1F, true);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		LeftArm.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, true);
		LeftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, true);

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setPos(1.0F, -0.5F, 0.0F);
		LeftArm.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.0F, 0.0F, 0.1309F);
		RightArm_r2.texOffs(40, 32).addBox(-2.75F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.1F, false);
		RightArm_r2.texOffs(40, 43).addBox(-2.75F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.3F, false);

		RightArm_r3 = new ModelRenderer(this);
		RightArm_r3.setPos(1.2061F, 0.81F, 0.0F);
		LeftArm.addChild(RightArm_r3);
		setRotationAngle(RightArm_r3, 0.0F, 0.0F, -0.0436F);
		RightArm_r3.texOffs(40, 0).addBox(-3.0F, -3.5F, -3.0F, 6.0F, 7.0F, 6.0F, -0.15F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}