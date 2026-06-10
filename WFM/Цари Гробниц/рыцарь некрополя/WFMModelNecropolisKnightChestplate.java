// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelNecropolisKnightChestplate extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer cockCape3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cockCape4;
	private final ModelRenderer cockCape;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cockCape2;
	private final ModelRenderer cape;
	private final ModelRenderer body_r1;
	private final ModelRenderer front;
	private final ModelRenderer cube_r17;
	private final ModelRenderer back;
	private final ModelRenderer cube_r18;
	private final ModelRenderer leftArm;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer RightArm_r2;
	private final ModelRenderer rightArm;
	private final ModelRenderer RightArm_r3;
	private final ModelRenderer RightArm_r4;

	public WFMModelNecropolisKnightChestplate() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);

		cockCape3 = new ModelRenderer(this);
		cockCape3.setPos(0.0F, 24.0F, 0.65F);
		body.addChild(cockCape3);
		setRotationAngle(cockCape3, -3.1416F, 0.0F, 3.1416F);
		cockCape3.texOffs(0, 18).addBox(-0.5F, -15.0F, -3.1F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -12.0F, -2.4F);
		cockCape3.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -1.0472F);
		cube_r1.texOffs(4, 18).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, -12.0F, -2.4F);
		cockCape3.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.0472F);
		cube_r2.texOffs(4, 18).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, -12.0F, -2.4F);
		cockCape3.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3491F);
		cube_r3.texOffs(4, 18).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, -12.0F, -2.4F);
		cockCape3.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.3491F);
		cube_r4.texOffs(4, 18).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, -12.0F, -2.5F);
		cockCape3.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -1.3526F);
		cube_r5.texOffs(0, 22).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(0.0F, -12.0F, -2.5F);
		cockCape3.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 1.3526F);
		cube_r6.texOffs(0, 22).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(0.0F, -12.0F, -2.3F);
		cockCape3.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.6981F);
		cube_r7.texOffs(0, 18).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(0.0F, -12.0F, -2.3F);
		cockCape3.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.6981F);
		cube_r8.texOffs(0, 18).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cockCape4 = new ModelRenderer(this);
		cockCape4.setPos(0.0F, -11.5F, -2.6F);
		cockCape3.addChild(cockCape4);
		cockCape4.texOffs(8, 18).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 12.0F, 0.0F, 0.0F, false);

		cockCape = new ModelRenderer(this);
		cockCape.setPos(0.0F, 24.0F, -0.85F);
		body.addChild(cockCape);
		cockCape.texOffs(0, 18).addBox(-0.5F, -15.0F, -3.1F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(0.0F, -12.0F, -2.4F);
		cockCape.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -1.0472F);
		cube_r9.texOffs(4, 18).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setPos(0.0F, -12.0F, -2.4F);
		cockCape.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 1.0472F);
		cube_r10.texOffs(4, 18).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setPos(0.0F, -12.0F, -2.4F);
		cockCape.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.3491F);
		cube_r11.texOffs(4, 18).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setPos(0.0F, -12.0F, -2.4F);
		cockCape.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.3491F);
		cube_r12.texOffs(4, 18).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setPos(0.0F, -12.0F, -2.5F);
		cockCape.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -1.3526F);
		cube_r13.texOffs(0, 22).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setPos(0.0F, -12.0F, -2.5F);
		cockCape.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 1.3526F);
		cube_r14.texOffs(0, 22).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setPos(0.0F, -12.0F, -2.3F);
		cockCape.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.6981F);
		cube_r15.texOffs(0, 18).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setPos(0.0F, -12.0F, -2.3F);
		cockCape.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.6981F);
		cube_r16.texOffs(0, 18).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cockCape2 = new ModelRenderer(this);
		cockCape2.setPos(0.0F, -11.5F, -2.6F);
		cockCape.addChild(cockCape2);
		cockCape2.texOffs(8, 18).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 12.0F, 0.0F, 0.0F, false);

		cape = new ModelRenderer(this);
		cape.setPos(0.0F, -1.0F, -3.0F);
		body.addChild(cape);
		setRotationAngle(cape, 1.3526F, 0.0F, 0.0F);
		

		body_r1 = new ModelRenderer(this);
		body_r1.setPos(0.0F, 0.0F, 0.0F);
		cape.addChild(body_r1);
		setRotationAngle(body_r1, 0.2182F, 0.0F, 0.0F);
		body_r1.texOffs(0, 46).addBox(-8.5F, 0.0F, 0.0F, 17.0F, 6.0F, 0.0F, 0.0F, false);

		front = new ModelRenderer(this);
		front.setPos(0.0F, 0.0F, 0.0F);
		cape.addChild(front);
		front.texOffs(-10, 54).addBox(-8.5F, 0.0F, -10.0F, 17.0F, 0.0F, 10.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setPos(0.0F, 4.0F, 5.0F);
		front.addChild(cube_r17);
		setRotationAngle(cube_r17, 1.4835F, 0.0F, 0.0F);
		cube_r17.texOffs(56, 38).addBox(-1.5F, -13.0F, 2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r17.texOffs(58, 41).addBox(-3.5F, -14.0F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r17.texOffs(58, 41).addBox(1.5F, -14.0F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r17.texOffs(58, 45).addBox(-5.5F, -12.0F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r17.texOffs(58, 45).addBox(3.5F, -12.0F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r17.texOffs(60, 49).addBox(5.5F, -12.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r17.texOffs(60, 49).addBox(-6.5F, -12.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r17.texOffs(60, 53).addBox(-7.5F, -11.0F, 2.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r17.texOffs(60, 53).addBox(6.5F, -11.0F, 2.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r17.texOffs(60, 60).addBox(7.5F, -9.0F, 2.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		cube_r17.texOffs(60, 60).addBox(-8.5F, -9.0F, 2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		back = new ModelRenderer(this);
		back.setPos(0.0F, 5.8578F, 1.2986F);
		cape.addChild(back);
		setRotationAngle(back, -0.4363F, 0.0F, -3.1416F);
		back.texOffs(-10, 54).addBox(-8.5F, 0.0F, -10.0F, 17.0F, 0.0F, 10.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setPos(0.0F, 4.0F, 5.0F);
		back.addChild(cube_r18);
		setRotationAngle(cube_r18, 1.4835F, 0.0F, 0.0F);
		cube_r18.texOffs(56, 38).addBox(-1.5F, -13.0F, 2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r18.texOffs(58, 41).addBox(-3.5F, -14.0F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r18.texOffs(58, 41).addBox(1.5F, -14.0F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r18.texOffs(58, 45).addBox(-5.5F, -12.0F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r18.texOffs(58, 45).addBox(3.5F, -12.0F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r18.texOffs(60, 49).addBox(5.5F, -12.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r18.texOffs(60, 49).addBox(-6.5F, -12.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r18.texOffs(60, 53).addBox(-7.5F, -11.0F, 2.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r18.texOffs(60, 53).addBox(6.5F, -11.0F, 2.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r18.texOffs(60, 60).addBox(7.5F, -9.0F, 2.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		cube_r18.texOffs(60, 60).addBox(-8.5F, -9.0F, 2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(5.0F, 2.0F, 0.0F);
		leftArm.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, true);
		leftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, true);

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setPos(2.0F, 5.5F, 0.0F);
		leftArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.7854F, 0.0F, 0.0F);
		RightArm_r1.texOffs(55, 0).addBox(1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setPos(2.1F, 6.5F, 0.0F);
		leftArm.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.7854F, 0.0F, 0.0F);
		RightArm_r2.texOffs(55, 4).addBox(1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, 2.0F, 0.0F);
		rightArm.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		rightArm.texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);

		RightArm_r3 = new ModelRenderer(this);
		RightArm_r3.setPos(-2.0F, 5.5F, 0.0F);
		rightArm.addChild(RightArm_r3);
		setRotationAngle(RightArm_r3, -2.3562F, 0.0F, 3.1416F);
		RightArm_r3.texOffs(55, 0).addBox(1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);

		RightArm_r4 = new ModelRenderer(this);
		RightArm_r4.setPos(-1.9F, 6.5F, 0.0F);
		rightArm.addChild(RightArm_r4);
		setRotationAngle(RightArm_r4, -2.3562F, 0.0F, 3.1416F);
		RightArm_r4.texOffs(55, 4).addBox(1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}