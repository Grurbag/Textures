// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelKroxigorBody extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body4;
	private final ModelRenderer body5;
	private final ModelRenderer neck2;
	private final ModelRenderer tail6;
	private final ModelRenderer tail7;
	private final ModelRenderer tail8;
	private final ModelRenderer tail9;
	private final ModelRenderer tail10;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArm5;
	private final ModelRenderer rightArm6;
	private final ModelRenderer rombs2;
	private final ModelRenderer leftArm_r1;
	private final ModelRenderer leftArm_r2;
	private final ModelRenderer leftArm_r3;
	private final ModelRenderer leftArm_r4;
	private final ModelRenderer leftArm_r5;
	private final ModelRenderer leftArm_r6;
	private final ModelRenderer leftArm_r7;
	private final ModelRenderer leftArm_r8;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArm4;
	private final ModelRenderer rombs;
	private final ModelRenderer leftArm_r9;
	private final ModelRenderer leftArm_r10;
	private final ModelRenderer leftArm_r11;
	private final ModelRenderer leftArm_r12;
	private final ModelRenderer leftArm_r13;
	private final ModelRenderer leftArm_r14;
	private final ModelRenderer leftArm_r15;
	private final ModelRenderer leftArm_r16;
	private final ModelRenderer leftArm5;

	public WFMModelKroxigorBody() {
		texWidth = 256;
		texHeight = 256;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 1.0F, 0.0F);
		

		body4 = new ModelRenderer(this);
		body4.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(body4);
		setRotationAngle(body4, 0.2618F, 0.0F, 0.0F);
		body4.texOffs(0, 0).addBox(-9.5F, -20.0F, -6.0F, 19.0F, 12.0F, 13.0F, 0.5F, false);
		body4.texOffs(64, 0).addBox(-9.5F, -20.0F, -6.0F, 19.0F, 12.0F, 13.0F, 0.7F, false);

		body5 = new ModelRenderer(this);
		body5.setPos(0.0F, 3.0F, 0.0F);
		body4.addChild(body5);
		body5.texOffs(12, 26).addBox(-7.5F, -11.0F, -5.0F, 15.0F, 10.0F, 11.0F, 0.5F, false);

		neck2 = new ModelRenderer(this);
		neck2.setPos(0.0F, -17.1206F, -0.684F);
		body4.addChild(neck2);
		setRotationAngle(neck2, -0.3491F, 0.0F, 0.0F);
		neck2.texOffs(157, 0).addBox(-8.0F, -4.0F, -7.0F, 16.0F, 12.0F, 10.0F, 0.0F, false);

		tail6 = new ModelRenderer(this);
		tail6.setPos(0.0F, 2.3404F, 2.9917F);
		body4.addChild(tail6);
		setRotationAngle(tail6, -1.0908F, 0.0F, 0.0F);
		tail6.texOffs(107, 0).addBox(-4.5F, -5.0F, -5.0F, 9.0F, 8.0F, 15.0F, 0.5F, false);
		tail6.texOffs(0, 237).addBox(4.5F, -8.0F, -5.0F, 0.0F, 3.0F, 15.0F, 0.0F, false);
		tail6.texOffs(0, 237).addBox(-4.5F, -8.0F, -5.0F, 0.0F, 3.0F, 15.0F, 0.0F, false);

		tail7 = new ModelRenderer(this);
		tail7.setPos(0.0F, 0.0F, 9.0F);
		tail6.addChild(tail7);
		setRotationAngle(tail7, 0.2182F, 0.0F, 0.0F);
		tail7.texOffs(110, 24).addBox(-3.5F, -4.0F, -2.0F, 7.0F, 7.0F, 13.0F, 0.5F, false);

		tail8 = new ModelRenderer(this);
		tail8.setPos(0.0F, 0.0F, 12.0F);
		tail7.addChild(tail8);
		setRotationAngle(tail8, 0.3491F, 0.0F, 0.0F);
		tail8.texOffs(111, 46).addBox(-2.5F, -4.0746F, -3.6868F, 5.0F, 6.0F, 13.0F, 0.5F, false);

		tail9 = new ModelRenderer(this);
		tail9.setPos(0.0F, 0.0F, 9.0F);
		tail8.addChild(tail9);
		tail9.texOffs(116, 68).addBox(-1.5F, -3.0746F, -3.6868F, 3.0F, 5.0F, 7.0F, 0.0F, false);

		tail10 = new ModelRenderer(this);
		tail10.setPos(0.0F, 0.0F, 3.0F);
		tail9.addChild(tail10);
		tail10.texOffs(117, 86).addBox(-0.5F, -2.0746F, -3.6868F, 1.0F, 4.0F, 7.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-9.5F, -12.0F, -6.0F);
		

		rightArm5 = new ModelRenderer(this);
		rightArm5.setPos(21.0F, 0.0F, 0.0F);
		rightArm.addChild(rightArm5);
		rightArm5.texOffs(0, 52).addBox(-27.5F, -5.0F, -5.0F, 9.0F, 11.0F, 10.0F, 0.5F, true);
		rightArm5.texOffs(38, 52).addBox(-27.5F, -5.0F, -5.0F, 9.0F, 11.0F, 10.0F, 0.7F, true);

		rightArm6 = new ModelRenderer(this);
		rightArm6.setPos(-23.5F, 5.5391F, 0.0F);
		rightArm5.addChild(rightArm6);
		rightArm6.texOffs(8, 75).addBox(-3.2898F, -3.0F, -4.0F, 7.0F, 16.0F, 8.0F, 0.5F, true);
		rightArm6.texOffs(38, 75).addBox(-3.2898F, -3.0F, -4.0F, 7.0F, 16.0F, 8.0F, 0.7F, true);

		rombs2 = new ModelRenderer(this);
		rombs2.setPos(-20.5F, 0.5F, 0.0F);
		rightArm5.addChild(rombs2);
		setRotationAngle(rombs2, -3.1416F, 0.0F, 3.1416F);
		

		leftArm_r1 = new ModelRenderer(this);
		leftArm_r1.setPos(0.0F, 0.0F, 6.0F);
		rombs2.addChild(leftArm_r1);
		setRotationAngle(leftArm_r1, 0.0F, 0.7854F, 0.0F);
		leftArm_r1.texOffs(0, 40).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		leftArm_r2 = new ModelRenderer(this);
		leftArm_r2.setPos(4.0F, 0.0F, 6.0F);
		rombs2.addChild(leftArm_r2);
		setRotationAngle(leftArm_r2, 0.0F, 0.7854F, 0.0F);
		leftArm_r2.texOffs(0, 40).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		leftArm_r3 = new ModelRenderer(this);
		leftArm_r3.setPos(7.0F, 0.0F, 5.0F);
		rombs2.addChild(leftArm_r3);
		setRotationAngle(leftArm_r3, 0.0F, 0.7854F, 0.0F);
		leftArm_r3.texOffs(0, 40).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		leftArm_r4 = new ModelRenderer(this);
		leftArm_r4.setPos(7.0F, 0.0F, 2.0F);
		rombs2.addChild(leftArm_r4);
		setRotationAngle(leftArm_r4, 0.0F, 0.7854F, 0.0F);
		leftArm_r4.texOffs(0, 40).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		leftArm_r5 = new ModelRenderer(this);
		leftArm_r5.setPos(7.0F, 0.0F, -2.0F);
		rombs2.addChild(leftArm_r5);
		setRotationAngle(leftArm_r5, 0.0F, 0.7854F, 0.0F);
		leftArm_r5.texOffs(0, 40).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		leftArm_r6 = new ModelRenderer(this);
		leftArm_r6.setPos(6.0F, 0.0F, -4.0F);
		rombs2.addChild(leftArm_r6);
		setRotationAngle(leftArm_r6, 0.0F, 0.7854F, 0.0F);
		leftArm_r6.texOffs(0, 40).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		leftArm_r7 = new ModelRenderer(this);
		leftArm_r7.setPos(3.0F, 0.0F, -4.0F);
		rombs2.addChild(leftArm_r7);
		setRotationAngle(leftArm_r7, 0.0F, 0.7854F, 0.0F);
		leftArm_r7.texOffs(0, 40).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		leftArm_r8 = new ModelRenderer(this);
		leftArm_r8.setPos(0.0F, 0.0F, -4.0F);
		rombs2.addChild(leftArm_r8);
		setRotationAngle(leftArm_r8, 0.0F, 0.7854F, 0.0F);
		leftArm_r8.texOffs(0, 40).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(9.5F, -12.0F, -6.0F);
		

		leftArm4 = new ModelRenderer(this);
		leftArm4.setPos(2.0F, -5.0F, 0.0F);
		leftArm.addChild(leftArm4);
		leftArm4.texOffs(0, 52).addBox(-4.5F, 0.0F, -5.0F, 9.0F, 11.0F, 10.0F, 0.5F, false);
		leftArm4.texOffs(38, 52).addBox(-4.5F, 0.0F, -5.0F, 9.0F, 11.0F, 10.0F, 0.7F, false);

		rombs = new ModelRenderer(this);
		rombs.setPos(-2.5F, 5.5F, 6.0F);
		leftArm4.addChild(rombs);
		

		leftArm_r9 = new ModelRenderer(this);
		leftArm_r9.setPos(0.0F, 0.0F, 0.0F);
		rombs.addChild(leftArm_r9);
		setRotationAngle(leftArm_r9, 0.0F, 0.7854F, 0.0F);
		leftArm_r9.texOffs(0, 40).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		leftArm_r10 = new ModelRenderer(this);
		leftArm_r10.setPos(4.0F, 0.0F, 0.0F);
		rombs.addChild(leftArm_r10);
		setRotationAngle(leftArm_r10, 0.0F, 0.7854F, 0.0F);
		leftArm_r10.texOffs(0, 40).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		leftArm_r11 = new ModelRenderer(this);
		leftArm_r11.setPos(7.0F, 0.0F, -1.0F);
		rombs.addChild(leftArm_r11);
		setRotationAngle(leftArm_r11, 0.0F, 0.7854F, 0.0F);
		leftArm_r11.texOffs(0, 40).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		leftArm_r12 = new ModelRenderer(this);
		leftArm_r12.setPos(7.0F, 0.0F, -4.0F);
		rombs.addChild(leftArm_r12);
		setRotationAngle(leftArm_r12, 0.0F, 0.7854F, 0.0F);
		leftArm_r12.texOffs(0, 40).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		leftArm_r13 = new ModelRenderer(this);
		leftArm_r13.setPos(7.0F, 0.0F, -8.0F);
		rombs.addChild(leftArm_r13);
		setRotationAngle(leftArm_r13, 0.0F, 0.7854F, 0.0F);
		leftArm_r13.texOffs(0, 40).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		leftArm_r14 = new ModelRenderer(this);
		leftArm_r14.setPos(6.0F, 0.0F, -10.0F);
		rombs.addChild(leftArm_r14);
		setRotationAngle(leftArm_r14, 0.0F, 0.7854F, 0.0F);
		leftArm_r14.texOffs(0, 40).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		leftArm_r15 = new ModelRenderer(this);
		leftArm_r15.setPos(3.0F, 0.0F, -10.0F);
		rombs.addChild(leftArm_r15);
		setRotationAngle(leftArm_r15, 0.0F, 0.7854F, 0.0F);
		leftArm_r15.texOffs(0, 40).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		leftArm_r16 = new ModelRenderer(this);
		leftArm_r16.setPos(0.0F, 0.0F, -10.0F);
		rombs.addChild(leftArm_r16);
		setRotationAngle(leftArm_r16, 0.0F, 0.7854F, 0.0F);
		leftArm_r16.texOffs(0, 40).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		leftArm5 = new ModelRenderer(this);
		leftArm5.setPos(-0.5F, 10.5391F, 0.0F);
		leftArm4.addChild(leftArm5);
		leftArm5.texOffs(8, 75).addBox(-3.2898F, -3.0F, -4.0F, 7.0F, 16.0F, 8.0F, 0.5F, false);
		leftArm5.texOffs(38, 75).addBox(-3.2898F, -3.0F, -4.0F, 7.0F, 16.0F, 8.0F, 0.7F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}