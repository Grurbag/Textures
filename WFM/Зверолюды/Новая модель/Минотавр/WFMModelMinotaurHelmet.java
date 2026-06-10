// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelMinotaurHelmet extends EntityModel<Entity> {
	private final ModelRenderer headArmour;
	private final ModelRenderer head_r1;
	private final ModelRenderer jaw_top2;
	private final ModelRenderer head_r2;
	private final ModelRenderer horn_left_armour;
	private final ModelRenderer horn_left_armour2;
	private final ModelRenderer horn_left_armour3;
	private final ModelRenderer horn_left_armour4;
	private final ModelRenderer horn_left_armour5;
	private final ModelRenderer horn_right_armour;
	private final ModelRenderer horn_right_armour2;
	private final ModelRenderer horn_right_armour3;
	private final ModelRenderer horn_right_armour4;
	private final ModelRenderer horn_right_armour5;
	private final ModelRenderer brovArmour;
	private final ModelRenderer brovArmour2;

	public WFMModelMinotaurHelmet() {
		texWidth = 128;
		texHeight = 128;

		headArmour = new ModelRenderer(this);
		headArmour.setPos(0.0F, -17.9226F, -5.5937F);
		setRotationAngle(headArmour, -0.3054F, 0.0F, 0.0F);
		

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(0.0F, -4.0F, -2.0F);
		headArmour.addChild(head_r1);
		setRotationAngle(head_r1, 0.4363F, 0.0F, 0.0F);
		head_r1.texOffs(-1, 47).addBox(-5.0F, -2.0F, -8.0F, 10.0F, 11.0F, 10.0F, 0.5F, false);

		jaw_top2 = new ModelRenderer(this);
		jaw_top2.setPos(-1.0F, 2.6108F, -7.3969F);
		headArmour.addChild(jaw_top2);
		setRotationAngle(jaw_top2, 0.48F, 0.0F, 0.0F);
		

		head_r2 = new ModelRenderer(this);
		head_r2.setPos(0.0F, -4.0F, -2.0F);
		jaw_top2.addChild(head_r2);
		setRotationAngle(head_r2, 0.4363F, 0.0F, 0.0F);
		head_r2.texOffs(38, 88).addBox(-1.0F, -1.0F, -6.0F, 4.0F, 4.0F, 4.0F, 0.5F, false);
		head_r2.texOffs(0, -10).addBox(1.0F, -10.0F, -5.0F, 0.0F, 10.0F, 10.0F, 0.0F, false);
		head_r2.texOffs(0, 68).addBox(-2.0F, 0.0F, -5.0F, 6.0F, 5.0F, 8.0F, 0.5F, false);

		horn_left_armour = new ModelRenderer(this);
		horn_left_armour.setPos(-5.0F, -4.2851F, -1.4621F);
		headArmour.addChild(horn_left_armour);
		setRotationAngle(horn_left_armour, 0.2182F, 0.0F, 0.0F);
		horn_left_armour.texOffs(52, 49).addBox(-3.0F, -1.5F, -4.5F, 7.0F, 3.0F, 4.0F, 0.5F, false);

		horn_left_armour2 = new ModelRenderer(this);
		horn_left_armour2.setPos(-2.0F, 0.0F, -1.0F);
		horn_left_armour.addChild(horn_left_armour2);
		setRotationAngle(horn_left_armour2, 0.0F, 0.0F, 0.3054F);
		horn_left_armour2.texOffs(55, 57).addBox(-5.0F, -1.5F, -2.8226F, 5.0F, 3.0F, 3.0F, 0.5F, false);

		horn_left_armour3 = new ModelRenderer(this);
		horn_left_armour3.setPos(-3.1619F, -0.0516F, 0.0F);
		horn_left_armour2.addChild(horn_left_armour3);
		setRotationAngle(horn_left_armour3, 0.0F, 0.0F, 0.3054F);
		horn_left_armour3.texOffs(57, 65).addBox(-5.0F, -1.5F, -2.3226F, 5.0F, 3.0F, 2.0F, 0.5F, false);

		horn_left_armour4 = new ModelRenderer(this);
		horn_left_armour4.setPos(-3.6046F, 0.0824F, 0.0F);
		horn_left_armour3.addChild(horn_left_armour4);
		setRotationAngle(horn_left_armour4, 0.0F, 0.0F, 0.3054F);
		horn_left_armour4.texOffs(58, 70).addBox(-5.0F, -1.5F, -2.2226F, 5.0F, 2.0F, 2.0F, 0.5F, false);

		horn_left_armour5 = new ModelRenderer(this);
		horn_left_armour5.setPos(-3.5976F, -0.2396F, 0.0F);
		horn_left_armour4.addChild(horn_left_armour5);
		setRotationAngle(horn_left_armour5, 0.0F, 0.0F, 0.3054F);
		horn_left_armour5.texOffs(60, 74).addBox(-4.0F, -0.5F, -1.8226F, 4.0F, 1.0F, 1.0F, 0.5F, false);

		horn_right_armour = new ModelRenderer(this);
		horn_right_armour.setPos(5.0F, -3.2029F, -6.3436F);
		headArmour.addChild(horn_right_armour);
		setRotationAngle(horn_right_armour, 2.9234F, 0.0F, -3.1416F);
		horn_right_armour.texOffs(52, 49).addBox(-3.0F, -1.5F, -4.5F, 7.0F, 3.0F, 4.0F, 0.5F, false);

		horn_right_armour2 = new ModelRenderer(this);
		horn_right_armour2.setPos(-2.0F, 0.0F, -1.0F);
		horn_right_armour.addChild(horn_right_armour2);
		setRotationAngle(horn_right_armour2, 0.0F, 0.0F, 0.3054F);
		horn_right_armour2.texOffs(55, 57).addBox(-5.0F, -1.5F, -2.8226F, 5.0F, 3.0F, 3.0F, 0.5F, false);

		horn_right_armour3 = new ModelRenderer(this);
		horn_right_armour3.setPos(-3.1619F, -0.0516F, 0.0F);
		horn_right_armour2.addChild(horn_right_armour3);
		setRotationAngle(horn_right_armour3, 0.0F, 0.0F, 0.3054F);
		horn_right_armour3.texOffs(57, 65).addBox(-5.0F, -1.5F, -2.3226F, 5.0F, 3.0F, 2.0F, 0.5F, false);

		horn_right_armour4 = new ModelRenderer(this);
		horn_right_armour4.setPos(-3.6046F, 0.0824F, 0.0F);
		horn_right_armour3.addChild(horn_right_armour4);
		setRotationAngle(horn_right_armour4, 0.0F, 0.0F, 0.3054F);
		horn_right_armour4.texOffs(58, 70).addBox(-5.0F, -1.5F, -2.2226F, 5.0F, 2.0F, 2.0F, 0.5F, false);

		horn_right_armour5 = new ModelRenderer(this);
		horn_right_armour5.setPos(-3.5976F, -0.2396F, 0.0F);
		horn_right_armour4.addChild(horn_right_armour5);
		setRotationAngle(horn_right_armour5, 0.0F, 0.0F, 0.3054F);
		horn_right_armour5.texOffs(60, 74).addBox(-4.0F, -0.5F, -1.8226F, 4.0F, 1.0F, 1.0F, 0.5F, false);

		brovArmour = new ModelRenderer(this);
		brovArmour.setPos(5.0F, -1.5448F, -7.5642F);
		headArmour.addChild(brovArmour);
		setRotationAngle(brovArmour, 0.6981F, 0.0F, 0.0F);
		brovArmour.texOffs(69, 11).addBox(-2.0F, -1.0F, -3.0F, 3.0F, 2.0F, 5.0F, 0.5F, false);

		brovArmour2 = new ModelRenderer(this);
		brovArmour2.setPos(-4.0F, -1.5448F, -7.5642F);
		headArmour.addChild(brovArmour2);
		setRotationAngle(brovArmour2, 0.6981F, 0.0F, 0.0F);
		brovArmour2.texOffs(69, 11).addBox(-2.0F, -1.0F, -3.0F, 3.0F, 2.0F, 5.0F, 0.5F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		headArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}